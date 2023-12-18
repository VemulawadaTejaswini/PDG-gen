import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] S=new int[n];
		int count=0;
		int x;
		for(int i=0;i<n;i++){
			x=scan.nextInt();
			S[i]=x;
		}
		int q=scan.nextInt();
		for(int i=0;i<q;i++){
			x=scan.nextInt();
			for(int j=0;j<n;j++){
				if(S[j]==x){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		scan.close();
	}
}