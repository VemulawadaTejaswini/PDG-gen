import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int res = 0;
        for (int a=1; a<=5; a++) {
          x = sc.nextInt();
          if(x == 0){
            res = a;
            break;
        	}
        }
      System.out.println(res);
    }
}