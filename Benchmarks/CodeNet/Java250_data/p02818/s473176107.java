import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          long A = getLong();
          long B = getLong();
          long K = getLong();
          long tmpA = A - K;
          if(tmpA <= 0){
            K = K - A;
            A = 0;
          }else{
            A = A - K;
            K = 0;
          }
          long tmpB = B - K;
          if(tmpB <= 0){
            B = 0;
          }else{
            B = tmpB;
          }
          myout(A + " " + B);
          
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
