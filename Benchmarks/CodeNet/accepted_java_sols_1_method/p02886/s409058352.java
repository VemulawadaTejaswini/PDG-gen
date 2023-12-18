import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int j=0;j<n;j++) {
			int h=scn.nextInt();
			arr.add(h);
		}int ans=0;
		for(int i=0;i<arr.size()-1;i++) {
			for(int j=i+1;j<arr.size();j++) {
				ans+= arr.get(i)*arr.get(j);
			}
		}System.out.println(ans);
    }
}