import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=String.valueOf(a)+String.valueOf(b);
		int x=Integer.parseInt(s);
		boolean ans=false;
		for(int i=1;i<=x;i++){
			if(x==i*i){
				ans=true;
				break;
			}
		}
		if(ans==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
