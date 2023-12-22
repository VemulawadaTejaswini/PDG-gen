import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double a = scan.nextDouble();
        	double sum = a;
        	for(int i = 2;i < 11;i++){
        		if(i % 2 == 0){
        			a *= 2.0;
        		}else{
        			a /= 3.0;
        		}
        		sum += a;
        	}
        	System.out.printf("%.7f\n",sum);
        }
    }
}