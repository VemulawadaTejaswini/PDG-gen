import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	int n=0;
	while(true){
		n=cin.nextInt();
		int[] s=new int[n];
		if(n==0){
			break;
		}
		double m=0;
		for(int i=0;i<n;i++){
			s[i]=cin.nextInt();
			m=m+s[i];
		}
		m=m/n;
		double x=0,a=0;
		/*x=シグマで計算した(s-m)^2)*/
		for(int q=0;q<n;q++){
			x=x+(s[q]-m)*(s[q]-m);
		}
		a=Math.sqrt(x/n);
		System.out.println(a);
	}
	}
}