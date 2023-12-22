import java.util.*;

class Main {
    static int a,b,c;
    static int count = 0;
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      for (int i=a; i<=b; i++) {
        if (c % i == 0){
          count++;
      }
      }
       System.out.println(count);
    }
}
