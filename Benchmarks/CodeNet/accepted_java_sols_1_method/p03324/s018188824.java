import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int d = sc.nextInt();
                int n = sc.nextInt();
                n += n / 100;
                d = (int)Math.pow(100 , d);
                System.out.println(d * n);
                sc.close();
        }
}//0=48
//鶏になれ