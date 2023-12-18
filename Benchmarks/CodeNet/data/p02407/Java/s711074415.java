import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main (String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int x =sc.nextInt();
        String q =" ";
        for(int i=1;i<=x;i++){
            String z = sc.next();
            q = z + q;

        }
        for(int i=0;i<x;i++){

            String c = String.valueOf(q.charAt(i));
            if(i==x-1){
            	sb.append(c);
            }else{
            sb.append(c).append(" ");
            }

        }

        System.out.println(sb);
        }

    }