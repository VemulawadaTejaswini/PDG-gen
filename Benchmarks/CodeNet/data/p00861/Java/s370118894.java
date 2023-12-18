import java.util.*;

public class Main {

	String input;
	int p;
	HashMap< Integer, HashMap<Integer, Integer> > values;
	int[] sizes;
	static final int PARSE_ERROR = -1;
	static final int BUG = -2;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			Integer ans = null;
			for(int i=1; ; i++){
				input = in.nextLine();
				if(input.equals(".")){
					if(i==1) return ;
					break;
				}
				if(ans != null) continue;
				if(i==1){
					values = new HashMap<Integer, HashMap<Integer, Integer> >();
					sizes = new int[0x100];
				}
				p = 0;
				if(input.indexOf("=") == -1){
					declaration();
				}
				else if(!assignment()){
					ans = i;
				}
			}
			System.out.println(ans==null?0:ans.intValue());
		}
	}

	boolean assignment(){
		int aname = array_name();
		p++;
		int num = expression();
		p++;
		p++;
		int expr = expression();
		if(expr < 0){
			return false;
		}
		if(sizes[aname] <= num){
			return false;
		}
		values.get(aname).put(num, expr);
		return true;
	}

	boolean declaration(){
		int aname = array_name();
		p++;
		int num = number();
		p++;
		sizes[aname] = num;
		values.put(aname, new HashMap<Integer, Integer>() );
		return true;
	}

	int expression(){
		if(p>=input.length()) return PARSE_ERROR;
		int num = number();
		if(num != PARSE_ERROR){
			return num;
		}
		int aname = array_name();
		p++;
		int exp = expression();
		p++;
		if(sizes[aname] <= exp || exp < 0){
			return BUG;
		}
		Integer ret = values.get(aname).get(exp);
		if(ret == null){
			return BUG;
		}
		return ret.intValue();
	}

	int array_name(){
		return input.charAt(p++);
	}

	int number(){
		if(!Character.isDigit(input.charAt(p))) return PARSE_ERROR;
		int r = input.charAt(p) - '0';
		p++;
		while(p < input.length() && Character.isDigit(input.charAt(p))){
			r = 10*r + input.charAt(p++) - '0';
		}
		return r;
	}

	public static void main(String args[]){
		new Main().run();
	}
}