import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                int yono = 0;
                for(int i = a ; i <= b ; i++){
                        int aa = i / 10000;
                        int bb = (i / 1000) % 10;
                        int dd = (i/ 10) % 10;
                        int ee = i % 10;
                        if(aa == ee && bb == dd)yono++;
                }
                System.out.println(yono);
        }
}
//鶏になれ