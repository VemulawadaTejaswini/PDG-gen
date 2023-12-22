import java.util.*;
public class Main {
        public static void main(String args[]){
          
        Scanner sc = new Scanner(System.in);
          
          //入力
          int L = sc.nextInt();
          
          double M = (double) L/3;
          
          //直方体の体積(最大)
          System.out.println(Math.pow(M,3));
        }
}