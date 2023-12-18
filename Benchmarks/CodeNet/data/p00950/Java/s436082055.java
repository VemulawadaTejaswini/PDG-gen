// ID:61516672
import java.util.*;
import java.io.*;
import java.text.*;
//import javax.script.*;

public class E {
//	static ScriptEngineManager sem = new ScriptEngineManager();
//	static ScriptEngine engine = sem.getEngineByName("javascript");

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String equation = "";
		try{
			equation = br.readLine();
		} catch (IOException ioe){
			System.err.println(ioe.getMessage());
		}
		if(equation.equals("")){ 
			System.err.println("Null Input");
			System.exit(-1);	
		}

		// make a list of replacement letter;
		String sign = "+*-01()=";
		String replet = "";
		for(int i = 0; i < equation.length(); i++){
			String letter = equation.substring(i,i+1);
			if(!sign.contains(letter) && !replet.contains(letter)){
				replet += letter;
			}
		}

		if(replet.length() > 8){
			System.out.println(0);
			return;
		}

		ArrayList<String> decript = new ArrayList<String>();
		if(replet.length() == 0){
			decript.add(equation);
		}
			
		System.out.println(decrypt(sign, replet, equation));
	}

	public static int decrypt(String sign, String letter, String equation){
		if(letter.length() == 0){
/*
			equation = "-0=0";
			String script = equation.replaceAll("-+","-")
															.replaceAll("=","==")
															.replaceAll("([^01])([01]+)","$10b$2")
															.replaceAll("^([01]+)","0b$1");
System.out.println(script);
			try{
				Object result = engine.eval("-0b0==0b0");
				boolean ans = ((Boolean)result).booleanValue();
System.out.println(equation);
				if(ans){ return 1; }
				else{ return 0; }
			} catch(ScriptException se){
				return 0;
			} catch(ClassCastException cce){
				return 0;
			}
*/
//System.out.println(equation);
			if(solve(equation)){
//System.out.println(equation);
				return 1;
			} else {
				return 0;
			}
		}
		if(sign.length() == 0){
			return 0;
		}

		int count = 0;
		for(int k = 0; k < sign.length(); k++){
			String s = sign.substring(k,k+1);
			if("+*()".contains(s)){ s = "\\" + s; }
			
			count += decrypt(	sign.replaceAll(s,""), 
												letter.substring(1,letter.length()),
												equation.replaceAll(letter.substring(0,1),s));
		}
		return count;
	}

	public static boolean solve(String equation){
		int cnt_eq = 0;
		for(int i = 0; i < equation.length(); i++){
			if(equation.substring(i,i+1).equals("=")){ cnt_eq++; }
		}
		if(cnt_eq != 1){ return false; }

		String[] expr = equation.split("=");
		if(expr.length != 2){ return false; }
		int[] ans = new int[2];
		for(int i = 0; i < 2; i++){
			try{
				Node n = Node.construct(expr[i]);
				ans[i] = Node.calculate(n);
			} catch(ParseException pe){
//if(equation.equals("0=-(0)") || equation.equals("0=(-0)") || equation.equals("-0=(0)")){
//if(Integer.parseInt(pe.getMessage().replaceAll("error", "")) > 10){
//System.out.println(pe.getMessage() + ":" + equation);
//System.out.println(pe.getMessage());
//}
//}
				return false;
			}
		}

//System.out.println(equation);
//System.out.println(ans[0] + ", " + ans[1]);
		return ans[0] == ans[1];
	}
}
class Node {
	public Node parent;
	Node left;
	Node right;
	String letter;
	boolean numFlg;
	boolean locked;

	Node(Node parent, Node left, Node right, String letter){
		this.parent = parent;
		this.left = left;
		this.right = right;
		this.letter = letter;
		if("+*-".contains(letter)){ 
			numFlg = false; 
		} else { 
			numFlg = true; 
		}
		locked = false;
	}

	public Node put(String let){
		Node n = new Node(null, null, null, let);
		if(this.parent != null){ 
			n.parent = this.parent.parent;
			if(n.parent != null){
				n.parent.right = n;
			}
			n.left = this.parent;
			this.parent.parent = n; 
		} else {
			n.left = this;
			this.parent = n;
		}
		return n;
	}

	public Node insert(String let){
		Node n = new Node(this.parent, this, null, let);
		if(this.parent != null){
			this.parent.right = n;
		}
		this.parent = n;
		return n;
	}

	public Node add(String let){
		Node n = new Node(this, null, null, let);
		this.right = n;
		return n;
	}

	public static Node construct(String equation) throws ParseException {
		Node node = null;
		for(int index = 0; index < equation.length(); index++){
//try{
//Node tmp = node;
//if(tmp != null){ while(tmp.parent != null){ tmp = tmp.parent; }}
//calculate(tmp);
//}catch(ParseException pe){}
//System.out.println();
			String letter = equation.substring(index,index+1);
			switch(letter){
				case "+":
					if(node == null){ throw new ParseException("error1", 0); }
					if(!node.numFlg && node.right == null){ throw new ParseException("error2", 0); }
					// put
					node = node.put(letter);
					break;
				case "*":
					if(node == null){ throw new ParseException("error3", 0); }
					if(!node.numFlg && node.right == null){ throw new ParseException("error4", 0); }
					if(node.parent == null || node.parent.letter.equals("*")){
						node = node.put(letter);
					} else {
						node = node.insert(letter);
					}
					break;
				case "-":
					if(node == null){
						node = new Node(null, null, null, letter);
						node.numFlg = true;
					} else if(!node.numFlg){
						if(node.right == null){
							node = node.add(letter);
							node.numFlg = true;
						} else {
							//node = node.insert(letter);
							node = node.put(letter);
						}
					} else {
						if(node.letter.matches("^-+$")){
							node.letter += letter;
						} else {
							node = node.put(letter);
						}
					}
					break;
				case "0":	
				case "1":
					if(node == null){
						node = new Node(null, null, null, letter);
					} else if(!node.numFlg){
						if(node.right == null){
							node = node.add(letter);
						} else {
							throw new ParseException("error8", 0);
						}
					} else if(!node.locked){
						node.letter += letter;
					} else {
						throw new ParseException("error16", 0);
					}
					break;
				case "(":
					int begin=0;
					Stack<Integer> stack = new Stack<Integer>();
					do{
						if(index >= equation.length()){
							throw new ParseException("error6", 0);
						}
						switch(equation.substring(index,index+1)){
							case "(":
								stack.push(index);
								break;
							case ")":
								begin = stack.pop();
								break;
							default:
								break;
						}
						index++;
					} while(!stack.empty());
					index--;
					Node n = construct(equation.substring(begin+1,index));
					if(!n.numFlg && n.right == null){
						throw new ParseException("error15", 0);
					} else if(n.numFlg){
						n.locked = true;
					}
					if(node == null){
						node = n;
					} else if(!node.numFlg && node.right == null){
						node.right = n;
						n.parent = node;
						node = n;
					} else {
						if(node.letter.matches("^-+$")){
							node.letter += "1";
							node = node.insert("*");
							node.right = n;
							n.parent = node;
							node = n;
						} else {
							throw new ParseException("error9", 0);
						}
					}
					break;
				case ")":	
				default:
					throw new ParseException("error5", 0);
			}
		}
		// return root
		if(node == null){ throw new ParseException("error7", 0); }
		while(node.parent != null){ node = node.parent; }
		return node;
	}

	public static int calculate(Node node) throws ParseException {
		if(node == null){ throw new ParseException("error12", 0); }
//System.out.println("node:" + node.letter);
		if(!node.numFlg){
			switch(node.letter){
				case "+":
					return calculate(node.left) + calculate(node.right);
				case "*":
					return calculate(node.left) * calculate(node.right);
				case "-":
					return calculate(node.left) - calculate(node.right);
			}
		}
		if(node.letter.matches("^-*0+[01]+$") || node.letter.matches("^-+$")){
			throw new ParseException("error10", 0);
		}
		String val = node.letter.replaceAll("--", "");
//System.out.println(val);
		int num = 0;
		try{
			num = Integer.parseInt(val, 2);
		} catch(NumberFormatException nfe){
			throw new ParseException("error11", 0);
		}
		return num;
	}
}