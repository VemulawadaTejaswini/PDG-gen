import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
       char a = sc.next().charAt(0);
       char b = sc.next().charAt(0);
       
       if (a == b){
           System.out.println('H'); //(H,H), (D,D)
       } else {
           System.out.println('D'); //(H,D),(D,H)
       }

    }
}