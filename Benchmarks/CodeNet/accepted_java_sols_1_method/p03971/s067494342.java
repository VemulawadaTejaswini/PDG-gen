import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext()){
			int n=cin.nextInt();
			int a=cin.nextInt();
			int b=cin.nextInt();
			String s=cin.next();
			int cur=0;
			int curb=0;
			for(int i=0;i<n;i++){
				char tmp=s.charAt(i);
				boolean flag=false;
				if(tmp=='a'){
					if(cur<a+b){
						flag=true;
						cur++;
					}
				}
				if(tmp=='b'){
					if(cur<a+b&&curb<b){
						flag=true;
						cur++;
						curb++;
					}
				}
				if(flag)System.out.println("Yes");
				else
					System.out.println("No");
			}
			
			
		}
	}
}