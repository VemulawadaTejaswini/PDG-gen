import java.util.*;

public class Main {
	private static Scanner sc=new Scanner(System.in);;

	public static void main(String args[]) {
		//System.out.println((int)'1');
		char a[]=sc.nextLine().toCharArray();
		int ans=0;
		for(int i=0;i<a.length;i++){
			
			ans+=a[i]-48;
		}
		System.out.println(ans);
	}
}