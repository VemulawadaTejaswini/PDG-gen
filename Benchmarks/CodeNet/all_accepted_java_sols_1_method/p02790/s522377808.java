import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        StringBuilder ab = new StringBuilder();
        StringBuilder ba = new StringBuilder();
        for(int i=0;i<a;i++){
            ab.append(b);
        }
        for(int i=0;i<b;i++){
            ba.append(a);
        }
        String abs = ab.toString();
        String bas = ba.toString();
        if(abs.compareTo(bas) < 0){
            System.out.println(abs);
        }else{
            System.out.println(bas);
        }

    }
}