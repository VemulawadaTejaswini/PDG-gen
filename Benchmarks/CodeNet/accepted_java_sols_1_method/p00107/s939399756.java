import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int[] c = new int[3];
            for(int i = 0;i < 3;i++){
            	c[i] = scan.nextInt();
            }
            if(c[0] == 0 && c[1] == 0 && c[2] == 0){
            	break;
            }
            Arrays.sort(c);
            double a = (double)c[1] * 0.5;
            double b = (double)c[0] * 0.5;
            int n = scan.nextInt();
            for(int i = 0;i < n;i++){
            	double r = (double)scan.nextInt();
            	if(r <= a){
            		System.out.println("NA");
            		continue;
            	}
            	if(b < Math.sqrt(r*r - a*a)){
            		System.out.println("OK");
            	}else{
            		System.out.println("NA");
            	}
            }
        }
    }
}