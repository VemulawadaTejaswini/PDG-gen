import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	int max = -1000000;
        int min = 1000000;
    	int num =sc.nextInt();
    	int tmp = 0;
    	long sum = 0;
    	for (int i=0;i<num;i++){
    		int a = sc.nextInt();
    		if(a>max){
    			max=a;
    		}

    		if(min>a){
    			min=a;
    		}
    		sum = sum+a;
    	}
        sb.append(min).append(" ").append(max).append(" ").append(sum);
    	System.out.println(sb);
    }

}