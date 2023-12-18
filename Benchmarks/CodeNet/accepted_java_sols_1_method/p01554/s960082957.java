import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String[]b=new String[a];
		for(int i=0;i<a;i++)b[i]=s.next();
		int t=0;
		int c=s.nextInt();
		for(int i=0;i<c;i++){
			String str=s.next();
			boolean ok=false;
			for(int j=0;j<a;j++)if(b[j].equals(str))ok=true;
			if(ok){
				if(t%2==0)System.out.println("Opened by "+str);
				else System.out.println("Closed by "+str);
				t++;
			}else System.out.println("Unknown "+str);
		}
	}
}