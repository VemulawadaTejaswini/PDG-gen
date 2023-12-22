import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			double[] d = new double[10];
			d[0] = sc.nextDouble();
			
			for(int i=1;i<10;i++){
				if(i%2==1){
					d[i] = d[i-1]*2;
				}else{
					d[i] = d[i-1]/3;
				}
			}
			double sum = 0;
			for(int i=0;i<10;i++){
				sum += d[i];
			}
				
			System.out.println(sum);
		}
	
	}	
}