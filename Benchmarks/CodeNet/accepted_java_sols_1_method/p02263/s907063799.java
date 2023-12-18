import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				String str = sc.nextLine();
				String[] s = str.split(" ");
				Stack<Integer> stk = new Stack<Integer>();
				if(s.length > 2){
					for(int i=0;i<s.length;i++){
						if(s[i].toString().equals("*"))
							stk.push((stk.pop()*stk.pop()));
						else if(s[i].toString().equals("/")){
							int a=stk.pop(),b=stk.pop();
							stk.push(b/a);
						}
						else if(s[i].toString().equals("+"))
							stk.push((stk.pop()+stk.pop()));
						else if(s[i].toString().equals("-")){
							int a=stk.pop(),b=stk.pop();
							stk.push(b-a);
						}
						else{
							stk.push(Integer.valueOf(s[i].toString()));
						}
					}
					System.out.printf("%d\r\n",stk.pop());
				}
			}
	}
}
