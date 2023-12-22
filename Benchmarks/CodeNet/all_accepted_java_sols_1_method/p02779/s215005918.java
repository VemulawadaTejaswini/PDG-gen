import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	Arrays.sort(a);
      	String ans = "YES";
      	for(int i=1; i<a.length; i++){
			if(a[i]==a[i-1]) ans = "NO";
		}
      	System.out.println(ans);
	}
}
