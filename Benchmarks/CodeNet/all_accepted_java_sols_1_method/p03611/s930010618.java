import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] p=new int[100001];
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			p[a]++;
			p[a+1]++;
			if(a!=0){
				p[a-1]++;
			}
		}
		Arrays.sort(p);
		System.out.println(p[100000]);
	}
}
