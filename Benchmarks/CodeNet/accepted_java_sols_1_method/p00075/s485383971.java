
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,g[]=new int[10000];
		double w[]=new double[10000],h[]=new double[10000],bmi[]=new double[10000];
		while(sc.hasNext()){
			String str[]=sc.next().split(",");
			g[i]=Integer.parseInt(str[0]);
			w[i]=Double.parseDouble(str[1]);
			h[i]=Double.parseDouble(str[2]);
			bmi[i]=w[i]/(h[i]*h[i]);
			i++;
		}
			for(int j=0;j<i;j++){
				if(bmi[j]>=25)
					System.out.println(g[j]);
			}
	}
}