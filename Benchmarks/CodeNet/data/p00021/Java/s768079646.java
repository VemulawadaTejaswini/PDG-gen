import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int k=0;k<n;k++){
				double[] x = new double[4];
				double[] y = new double[4];
				for(int i=0;i<4;i++){
					x[i] = sc.nextDouble();
					y[i] = sc.nextDouble();
				}
				double a=0;
				double b=0;
				
				a = (y[1]-y[0])/(x[1]-x[0]);
				b = (y[3]-y[2])/(x[3]-x[2]);
				
				if(x[0]==x[1] && x[2]==x[3]){
					System.out.println("YES");
				}else if(y[0]==y[1] && y[2]==y[3]){
					System.out.println("YES");
				}else if(a==b){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}
	}	
}