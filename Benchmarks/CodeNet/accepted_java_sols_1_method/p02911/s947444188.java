import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0; i<q; i++){
			int b=sc.nextInt()-1;
			sum++;
			a[b]++;
		}
		for(int i=0; i<n; i++){
			if(a[i]-sum<=-k){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}
	}
}
