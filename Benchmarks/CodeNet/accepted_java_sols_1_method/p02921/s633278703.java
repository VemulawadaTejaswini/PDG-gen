import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);

      String sb1 = sc.next();
      String sb2 = sc.next();
      int a = 0;
      
            for(int i = 0;i<3;i++){
          if(String.valueOf(sb1.charAt(i)).equals(String.valueOf(sb2.charAt(i)))){
              a++;
          }
      }
        System.out.println(a);
    }
}
