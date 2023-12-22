import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			int h=scn.nextInt();
			arr.add(h);
		}ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			ans.add(0);
		}
		for(int j=0;j<n;j++) {
			ans.set(arr.get(j)-1, j+1);
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans.get(i)+" ");
		}
    }
}