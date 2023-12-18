import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] memo=new int[10];
		for(int s=0;s<10;s++)memo[s]=in.nextInt();
		Arrays.sort(memo);
		for(int i=9;i>=7;i--)System.out.println(memo[i]);
	}
}