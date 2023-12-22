import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x= sc.nextLong();
		long t=100;
		long ans=0;
		while(x>t){
			t+=t/100;
			ans++;
		}
		System.out.println(ans);
	}
}
