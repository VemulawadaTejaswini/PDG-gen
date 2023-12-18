import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        long mov = Math.abs(x/d);

        if(mov >= k){
            if(x<0){
               System.out.println(Math.abs(x+k*d)); 
            }
            else{
                System.out.println(Math.abs(x-k*d));
            }
        }
        else if(mov < k){
            long num = k-mov;
            if(x<0){
                
                x = x+mov*d;
                if(num%2==1){
                    long dist  = Math.min(Math.abs(x-d),Math.abs(x+d));
                    System.out.println(dist);
                }
                else{
                    System.out.println(Math.abs(x));
                }

            }
            else{
                x = x-mov*d;
                //x = x+mov*d;
                if(num%2==1){
                    long dist  = Math.min(Math.abs(x-d),Math.abs(x+d));
                    System.out.println(dist);
                }
                else{
                    System.out.println(Math.abs(x));
                }
            }
        }
    }
}