import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int ans=0;
		int b=0;
		int trueans=0;
		boolean flag=false;
		for(int baisu=M/N;baisu>0;baisu--){
		    b=M;
		    if(M%baisu==0&&M/baisu>=N){
		        ans=baisu;
		        break;
		    }
		}
		System.out.println(ans);
	}
}