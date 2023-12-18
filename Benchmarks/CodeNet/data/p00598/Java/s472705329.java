import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while(true){
				/* input from here */
				if((line = r.readLine())==null){
					break;
				}
				HashMap<String, Integer[]>  sets = new HashMap<String, Integer[]>();
				ArrayList<Integer> U = new ArrayList<Integer>();
				while(true){
					String[] str = line.split(" ");
					if(str[0].contains("R")){
						break;
					}
					int n = Integer.parseInt(str[1]);
					Integer[] e = new Integer[n];
					String[] line2 = r.readLine().split(" ");

					for(int i=0;i<n;i++){
						e[i] = Integer.parseInt(line2[i]);
						if(!U.contains(e[i])) U.add((Integer)e[i]);
					}
					Arrays.sort(e);
					sets.put(str[0], e);
					line = r.readLine();
				}
				Integer[] setU = U.toArray(new Integer[U.size()]); 
				Arrays.sort(setU);
				sets.put("U", setU);

				String exp = r.readLine();
				/* input till here */
				/* parsing from here */
				Expression e = parse(exp);
				/* parsing till here */
				/* semantic analysis from here */
				Integer[] res = calc(e,sets);
				/* semantic analysis till here */
				/* output */
				Arrays.sort(res);
				if(res.length>0){
					for(int i=0;i<res.length-1;i++){

						System.out.print(res[i]+ " ");
					}
					System.out.println(res[res.length-1]);
				} else {
					System.out.println("NULL");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Expression parse(String exp){
		//single term
		if(exp.length()<=2){
			Expression e = new Expression(exp);
			return e;
		}
		//2-term-operands
		String ops = "iuds"; 
		String left = "", right = "";
		int index = exp.length()-1;
		int level = 0;
		Expression e = null;
		boolean opfound = false;
		while(index>=0){
			if(exp.charAt(index)==')'){
				level++;
			} else if(exp.charAt(index)=='('){
				level--;
			}
			if(level==0&&ops.indexOf(exp.substring(index,index+1))>-1){
				char op = exp.charAt(index);
				left = exp.substring(0,index);
				right = exp.substring(index+1,exp.length());

				e = new Expression(op, parse(left), parse(right));
				opfound = true;
				break;
			}
			index--;
		}
		//single-term operand
		if(!opfound&&exp.charAt(0)=='c'){
			e = null;
			if(exp.charAt(1)!='('){
				e = new Expression('c',new Expression(exp.substring(1,2)));
			} else {
				index = 1;
				while(exp.charAt(index)!=')'){
					index++;
				}
				String p = exp.substring(2,index);
				e = new Expression('c',parse(p));
			}
			return e;
		}
		if(!opfound){
			return parse(exp.substring(1,exp.length()-1));
		}

		return e;
	}

	public static Integer[] calc(Expression e, HashMap<String, Integer[]> sets){
		Integer[] res = new Integer[500];
		ArrayList<Integer> reslist = new ArrayList<Integer>();
		ArrayList<Integer> left = null;
		switch (e.op) {
		case 'c':
			Expression u = new Expression("U");
			res = calc(new Expression('d',u,e.left),sets);
			break;
		case 'i':
			for(Integer i : calc(e.left, sets)){
				for(Integer j :calc(e.right,sets)){
					if(i==j){
						reslist.add(i);
					}
				}
			}
			res = reslist.toArray(new Integer[reslist.size()]);
			break;
		case 'u' :
			left = new ArrayList<Integer>(Arrays.asList(calc(e.left,sets)));

			boolean found = false;
			reslist = left;

			for(Integer i : calc(e.right,sets)){
				for(Integer j : calc(e.left,sets)){
					if(i==j){
						found = true;
						break;
					}
				}
				if(!found){
					reslist.add(i);
				}
				found = false;
			}

			res = reslist.toArray(new Integer[reslist.size()]);
			break;
		case 'd' :
			found = false;
			for(Integer i : calc(e.left,sets)){
				for(Integer j : calc(e.right,sets)){
					if(i==j){
						found = true;
					}
				}
				if(!found){
					reslist.add(i);
				}
				found = false;
			}
			res = reslist.toArray(new Integer[reslist.size()]);
			break;
		case 's' :
			Expression sleft = new Expression('d',e.left,e.right);
			Expression sright = new Expression('d',e.right,e.left);

			res = calc(new Expression('u',sleft,sright),sets);
			break;
		default :
			if(e.end.charAt(0)=='('){
				e.end = e.end.substring(1,e.end.length()-1);
			} else if(e.end.charAt(0)=='c'){
				res = calc(new Expression('c',new Expression(e.end.substring(1))),sets);
			} else {
				res = sets.get(e.end);
			}
		}
		return res;
	}
}
class Expression {
	public char op;
	public String end;
	public Expression left,right;
	//blank node
	public Expression(){

	}
	//leaf node
	public Expression(String s){
		this.op = '-';
		this.left = null;
		this.right = null;
		this.end = s;
	}
	//complement
	public Expression(char op, Expression left){
		this.op = op;
		this.left = left;
	}
	//other operands
	public Expression(char op, Expression left, Expression right){
		this.op = op;
		this.left = left;
		this.right = right;
	}
	public void output(){
		System.out.print("(");
		if(left==null&&right==null){
			System.out.print(this.end);
		} else if(op=='c'){
			System.out.print(op + " ");
			left.output();
		} else if(right==null){
			left.output();
		} else {
			System.out.print(op + " ");
			left.output(); 
			System.out.print(" ");
			right.output();
		}
		System.out.print(")");
	}
}