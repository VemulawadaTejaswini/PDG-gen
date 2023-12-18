import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	int x =sc.nextInt();
    	for(int i=1;i<=x;i++){


    		if ( i % 10 == 3&&i>3 ){
    			sb.append(i).append(" ");
    		}

    		if(i%3==0){
    			sb.append(i).append(" ");
    		}
    	}

        System.out.print(sb);
    }

}