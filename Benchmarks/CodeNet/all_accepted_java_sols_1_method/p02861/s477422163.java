
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        for(int i=0;i<N;i++){
        	x[i]= sc.nextInt();
        	y[i]= sc.nextInt();
        }
        int n = N*(N-1)/2;
        double distance = 0;
        
        for(int i=0;i<N-1;i++) {
            for(int j=i+1;j<N;j++) {
            	distance += Math.sqrt(Math.pow(x[j]-x[i], 2) + Math.pow(y[j]-y[i], 2));
            }
        }
        
        double aveDistance = distance * (N-1) / n;
        
        
        System.out.print(aveDistance);
        
	}
	
        
        
}





