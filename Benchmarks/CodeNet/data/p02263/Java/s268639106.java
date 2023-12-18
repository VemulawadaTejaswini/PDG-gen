import java.util.*;
class Main{
	void aaaa(){
		Scanner sc=new Scanner(System.in);
		int[] sk=new int[100];
		String st;
		int i=0;
		while(sc.hasNext()){
			st=sc.next();
			int a,b;
			if("+".equals(st)){
				a=sk[i];
				i--;
				b=sk[i];
				sk[i]=(a+b);
			}else if("*".equals(st)){
				a=sk[i];
				i--;
				b=sk[i];
				sk[i]=(a*b);
			}else if("-".equals(st)){
				b=sk[i];
				i--;
				a=sk[i];
				sk[i]=(a-b);
			}else if("e".equals(st)){
				break;
			}else{
				i++;
				sk[i]=Integer.parseInt(st);
			}
		}
		System.out.println(sk[i]);
	}
	public static void main(String[]arg){
		Main dn=new Main();
		dn.aaaa();
	}
}