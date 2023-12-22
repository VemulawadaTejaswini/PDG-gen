import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M1 = sc.nextInt();
        int D1 = sc.nextInt();
        int M2 = sc.nextInt();
        int D2 = sc.nextInt();

        if( M2 != M1 + 1 || (M1 == 12 && M2 == 1)){
            System.out.println("0");
        }else{
        System.out.println("1");
        }
    }
}