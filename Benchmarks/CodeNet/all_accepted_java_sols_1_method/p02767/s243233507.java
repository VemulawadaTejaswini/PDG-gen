
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] x= new int[n];
		double allx=0;
		double allx2=0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			allx+=x[i];
			allx2+=x[i]*x[i];
		}
		int p;
		if(allx/n-(int)(allx/n)<0.5){
			p=(int)(allx/n);
		}else{
			p=(int)(allx/n)+1;
		}
	System.out.println((int)(allx2-2*allx*p+n*p*p));
	}
}