import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			String str = stdIn.nextLine();
			char[] ch = str.toCharArray();
			if(ch.length==1&&ch[0]=='.')
				break;
			boolean ans=true;
			AtomicInteger num = new AtomicInteger();
			for(int i= 0;i<ch.length;i++){
				num.set(i);
				if(ch[i]=='('){
					if(!func(ch,1,num)){
						ans=false;
						break;
					}
					i=num.get();
					continue;
				}
				else if(ch[i]=='['){
					if(!func(ch,2,num)){
						ans=false;
						break;
					}
					i=num.get();
					continue;
				}
				else if(ch[i]==')'||ch[i]==']'){
					ans=false;
					break;
				}
//				System.out.println(num.get());
			}			
			if(ans){
				System.out.println("yes");
			}
			else
				System.out.println("no");	
		}
	}

	static boolean func(char[] ch,int state,AtomicInteger num){
		boolean ret=false;
		num.getAndIncrement();
		for(int i= num.get();i<ch.length;i++){
			num.set(i);
			if(ch[i]=='('){
				if(!func(ch,1,num)){
					ret=false;
					break;
				}
				i=num.get();
				continue;
			}
			else if(ch[i]=='['){
				if(!func(ch,2,num)){
					ret=false;
					break;
				}
				i=num.get();
				continue;
			}
			else if(ch[i]==')'&&state==2){
				ret=false;
				break;
			}
			else if(ch[i]==']'&&state==1){
				ret=false;
				break;
			}
			else if(ch[i]==')'&&state==1){
				ret=true;
				break;
			}
			else if(ch[i]==']'&&state==2){
				ret=true;
				break;
			}
//			System.out.println(num.get());
		}
		return ret;
	}
}