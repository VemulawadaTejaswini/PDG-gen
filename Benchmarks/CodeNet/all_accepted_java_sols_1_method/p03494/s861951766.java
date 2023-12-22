import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		int cd = 0;
		for(;;){
			int t = 0;
			for(int i=0;i<n;i++){
				if(x[i]%2==0){
					x[i]/=2;
					t++;
				}
			}
			if(t==n)
				cd++;
			else
				break;
		}
		System.out.println(cd);
	}
}