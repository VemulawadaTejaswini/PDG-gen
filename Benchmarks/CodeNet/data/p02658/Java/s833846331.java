import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
      	long r = 1;
        for (int i=0; i<18; i++) {
       	r = r*10;
        }
        for (int i=0; i<n-1; i++) {
       	long b = sc.nextLong();
        a = a*b;
        }
      if(a > r){
        System.out.println(-1);
      }else{
        System.out.println(a);
      }
    }
}