import java.util.*; 
import java.lang.Math;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        
        System.out.println(Math.min(N%K, Math.abs(N%K-K)));
    }
}