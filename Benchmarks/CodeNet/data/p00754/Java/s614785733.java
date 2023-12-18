import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1171().doIt();
	}
	
	class AOJ1171{
		String input;
		
		String solve(){
			ArrayList<Character> list = new ArrayList<Character>();
			int n = input.length();
			char[] text = input.toCharArray();
			for(int i=0;i<n;i++){
//				System.out.println(list);
				if(text[i]=='('||text[i]=='[')list.add(text[i]);
				else if(text[i]==')'){
					if(list.size()==0)return "no";
					char a = list.remove(list.size()-1);
					if(a!='(')return "no";
				}else if(text[i]==']'){
					if(list.size()==0)return "no";
					char a = list.remove(list.size()-1);
					if(a!='[')return "no";
				}
			}
			return "yes";
		}
		
		void doIt(){
			while(in.hasNext()){
				input = in.nextLine();
				if(input.equals("."))break;
				System.out.println(solve());
			}
		}
	}
	
}