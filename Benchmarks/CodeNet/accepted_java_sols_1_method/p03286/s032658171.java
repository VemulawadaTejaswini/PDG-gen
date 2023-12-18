import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		if(n==0)s = "0";
		while(n!=0){
			if(n<0){
				s = String.valueOf(n - ((n-1)/-2)*-2) + s;
				n = (n-1)/-2 ;
			}
			else {
				s = String.valueOf(n - (n/-2)*-2) + s;
				n /= -2;
			}
		}
		System.out.println(s);
	}
}