import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
      	long l = 0;
      
      	if(a >= k){
          l = k;
        }else if (a < k && (a+b) >= k){
          l = a*1;
        }else {
          l = a*1 + (k-a-b)*(-1);
        }
      System.out.println(l);
    }
}