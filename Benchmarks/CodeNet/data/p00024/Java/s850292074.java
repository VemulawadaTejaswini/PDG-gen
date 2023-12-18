//Volume0-0024
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N;
    	while(sc.hasNext()){
    		N = (int)(4.9*Math.pow(sc.nextDouble()/9.8,2)/5)+2;
    		System.out.println(N);
    	}
    }
}