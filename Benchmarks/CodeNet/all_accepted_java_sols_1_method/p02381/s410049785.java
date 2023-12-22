import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n;
    	int total;
    	double hyouzyun;
    	double m;
    	double a;
    	double[] student;
    	
    	for(;;){
    		n = scan.nextInt();
    		total = 0;
    		hyouzyun = 0.0;
    		a = 0.0;
    		
    		if(n == 0){
    		break;
    		}
    		student = new double[n]; 
    		for(int i = 0; i < n; i++){
    			student[i] = scan.nextDouble();
    			total += student[i];
    		}
    		m = (double)total / (double)n;
    		
    		for(int i = 0; i < n; i++){
    			a += Math.pow((student[i] - m), 2);
    		}
    		a /= n;
    		hyouzyun = Math.sqrt(a);
    		
    		System.out.println(String.format("%.8f", hyouzyun));
    	}
     }
}