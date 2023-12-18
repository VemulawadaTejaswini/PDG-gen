import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	while(true){
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if(a==0&&b==0){
    			break;
    		}

    		for(int i=0;i<a;i++){
    			for(int x=0;x<b;x++){
    				sb.append("#");
    			}
    			sb.append("\n");
    		}
    		sb.append("\n");
    	}
        System.out.print(sb);
    }

}