import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int flag = 0;
      
      while(a != 0 || c != 0){
        c -= b;
        if(c <= 0){
          flag = 1;
          break;
        }
        a -= d;
        if(a <= 0){
          flag = 2;
          break;
        }
      }
      if(flag == 1){
        System.out.println("Yes");
      } else if (flag == 2) {
        System.out.println("No");
      }
    }
}