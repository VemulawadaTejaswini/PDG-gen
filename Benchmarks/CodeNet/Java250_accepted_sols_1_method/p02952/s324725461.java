import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int yono = 0;
                for(int i = 1 ; i <= n ; i++){
                        int keta = (int)Math.log10(i);
                        keta = keta % 2;
                        if(keta == 0)yono++;
                }
                System.out.println(yono);
        }
}//0=48
 //a=97 a -> +26 = 123
//鶏になれ