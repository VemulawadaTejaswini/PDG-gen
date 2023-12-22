import java.util.Scanner;

public class Main {
	static  int c=1;
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int ans=0,i;
		boolean flag=false;
		int a=stdin.nextInt();
		int b=stdin.nextInt();
		for(i=a;i<=b;i++){
			String si=new String(""+i);
			int length=si.length();
			int  min=0;
			int max=length-1;
			while(min<max){
				if(si.charAt(min++)==si.charAt(max--))
					flag=true;

				else {
					flag=false;
					break;
				}
			}
			if(flag){
				ans++;
				flag=false;
			}
		}
		System.out.println(ans);
	}
}