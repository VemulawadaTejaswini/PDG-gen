import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n;
    	int total;
    	double hyouzyun;
    	double m;
    	double a;
    	int[] student;
    	
    	for(;;){
    		n = scan.nextInt();
    		total = 0;
    		hyouzyun = 0.0;
    		a = 0.0;
    		
    		if(n == 0){
    		break;
    		}
    		student = new int[n]; 
    		for(int i = 0; i < n; i++){
    			student[i] = scan.nextInt();
    			total += student[i];
    		}
    		m = total / n;
    		
    		for(int i = 0; i < n; i++){
    			a += Math.pow((student[i] - m), 2);
    		}
    		a /= n;
    		hyouzyun = Math.sqrt(a);
    		
    		System.out.println(String.format("%.8f", hyouzyun));
    	}
     }
}