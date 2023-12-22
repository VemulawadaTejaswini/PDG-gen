import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long n = sc.nextLong();
        long ret = 0;
        for(int i=0;i<n;i++){
          long a = sc.nextLong();
          ret += a;
        }
      if(ret>=h){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}