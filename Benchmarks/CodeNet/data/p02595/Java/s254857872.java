import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            long x = in.nextLong();
            long y  =in.nextLong();
            double p = Math.sqrt(x*x+y*y);
            if(p <= d){
                count++;
            }
        }
        System.out.println(count);
    }
}