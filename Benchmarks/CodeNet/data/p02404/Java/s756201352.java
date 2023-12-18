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

    		for(int i=1;i<=a;i++){
    			for(int x=1;x<=b;x++){
    				 if(i==1||i==a){
    					 sb.append("#");
    				 }
    			     else{
    				    if(x==1||x==b){
    					    sb.append("#");
    				    }else{
    				        sb.append(".");
    				    }
    			     }
    			}
    			sb.append("\n");
    		}
    		sb.append("\n");
    	}
        System.out.print(sb);
    }

}