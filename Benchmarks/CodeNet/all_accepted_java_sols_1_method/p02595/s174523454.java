import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count = 0;
        long n = sc.nextLong();
        long d = sc.nextLong();
        for(long i =0;i<n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if(Math.sqrt((x*x)+(y*y))<=d){
                count++;
            }
            else    
                continue;
        }
        System.out.println(count);
    }
    
}