import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scn.nextInt();
		}
      	int count4 = 0;
      	int count2 = 0;
      	for(int i=0; i<n; i++){
          if(a[i]%4==0) count4++;
          else if(a[i]%2==0) count2++;
        }
      	String ans = "No";
      	if(count4>=n/2 || count2==n-2*count4) ans = "Yes";
      	System.out.println(ans);
	}
}
