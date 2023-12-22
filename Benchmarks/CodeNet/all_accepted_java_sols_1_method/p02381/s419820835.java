import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		DecimalFormat df1 = new DecimalFormat("0.########");
		DecimalFormat df2 = new DecimalFormat("0.00000000");
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n!=0){
				int[] s = new int[n];
				double ave = 0;
				int i;
				
				for(i=0; i<n; i++){
					s[i] = sc.nextInt();
					ave += s[i];
				}
				ave = ave/n;
				
				double a=0;
				for(i=0; i<n; i++){
					a += (s[i]-ave)*(s[i]-ave);
				}
				a = a/n;
				a = Math.sqrt(a);
				
				if(a > 0){
					System.out.println(df1.format(a));
				}
				if(a == 0){
					System.out.println(df2.format(a));
				}
			}
		}
    }
}
