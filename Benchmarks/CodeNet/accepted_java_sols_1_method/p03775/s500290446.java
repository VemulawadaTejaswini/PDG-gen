import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long min = Integer.MAX_VALUE;

        for(long a=1; a<=Math.sqrt((double)N);a++){
            if(N%a==0){
                long b = N/a; 
                int f = Math.max(String.valueOf(a).length(),String.valueOf(b).length());
                if(f<min) min = f;
            }
            
        }
        System.out.println(min);

    }
}