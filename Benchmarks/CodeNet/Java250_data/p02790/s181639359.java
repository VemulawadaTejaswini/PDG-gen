import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans="";
		if (a<=b) {
			for(int i=1;i<=b;i++){
				ans=ans+a;
			}
		}
		else{
			for(int i=1;i<=a;i++){
				ans=ans+b;
			}
		}
		System.out.println(ans);
    }
}