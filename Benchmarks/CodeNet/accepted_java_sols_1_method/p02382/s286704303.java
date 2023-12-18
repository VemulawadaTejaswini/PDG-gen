import java.util.Scanner;

class Main{
        public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n;
    	int[] Vec_x;
    	int[] Vec_y;
    	double[] D = new double[3];
    	double D_Max = 0.0;
    	
    	n = scan.nextInt();
    	Vec_x = new int[n];
    	Vec_y = new int[n];
    	
    	for(int i = 0; i < n; i++){
    		Vec_x[i] = scan.nextInt();
    	}
    	for(int i = 0; i < n; i++){
    		Vec_y[i] = scan.nextInt();
    	}
    	
    	//p = 1
    	for(int i = 0; i < n; i++){
    		D[0] += Math.abs(Vec_x[i] - Vec_y[i]); 
    	}
    	System.out.println(String.format("%.6f", D[0]));
    	
    	//p = 2
    	for(int i = 0; i < n; i++){
    		D[1] += Math.pow(Math.abs(Vec_x[i] - Vec_y[i]), 2); 
    	}
    	D[1] = Math.pow(D[1], 1.0/2.0);
    	System.out.println(String.format("%.8f", D[1]));
    	//p = 3
    	for(int i = 0; i < n; i++){
    		D[2] += Math.pow(Math.abs(Vec_x[i] - Vec_y[i]), 3); 
    	}
    	D[2] = Math.pow(D[2], 1.0/3.0);
    	System.out.println(String.format("%.8f", D[2]));
    	
    	D_Max = Math.abs(Vec_x[0] - Vec_y[0]);
    	for(int i = 0; i < n; i++){
    		if(D_Max < Math.abs(Vec_x[i] - Vec_y[i])) {
    			D_Max = Math.abs(Vec_x[i] - Vec_y[i]);
    		}
    	}
    	System.out.println(String.format("%.8f", D_Max));
     }
}