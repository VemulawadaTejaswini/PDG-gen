import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int x =sc.nextInt();
        for(int i=1;i<=x;i++){
            int z =i ;
            if(z%3==0){
            	sb.append(" ").append(i);
            }else{
                while(z != 0){
            	    if(z%10 == 3){
            		    sb.append(" ").append(i);
            		    break;
            	    }else{
            	         z /=10;
            	     }
                }
            }

        }
        System.out.println(sb);
        }

    }