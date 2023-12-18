import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int k = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = scn.nextInt();
		}
      	Arrays.sort(a);
      	int ans = 0;
      	for(int i=0; i<k; i++) ans+=a[i];
      	System.out.println(ans);
	}
}