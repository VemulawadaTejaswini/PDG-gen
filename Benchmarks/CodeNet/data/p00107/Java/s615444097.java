import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0 && b==0 && c==0)break;
			
			double[] d = new double[3];
			d[0] = Math.sqrt(a*a + b*b);
			d[1] = Math.sqrt(b*b + c*c);
			d[2] = Math.sqrt(c*c + a*a);
			Arrays.sort(d);
			
			int n = sc.nextInt();
			int r;
			for(int i=0;i<n;i++){
				r = sc.nextInt();
				if(d[0]<r*2){
					System.out.println("OK");
				}else{
					System.out.println("NA");
				}
				
			}
			
		}
	}	
}