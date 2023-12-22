import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int k =scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			int h=scn.nextInt();
			arr.add(h);
		}int ans=0;
		for(int j=0;j<n;j++) {
			if(arr.get(j)>=k) {
				ans++;
			}
		}System.out.println(ans);
    }
}