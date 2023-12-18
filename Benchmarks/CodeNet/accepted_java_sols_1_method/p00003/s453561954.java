import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int[] x=new int[3];
			x[0]=sc.nextInt();
			x[1]=sc.nextInt();
			x[2]=sc.nextInt();
			Arrays.sort(x);
			if(x[0%3]*x[0%3]+x[1%3]*x[1%3]==x[2%3]*x[2%3]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		sc.close();
	}
}