import java.util.Scanner;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        if((a == b || b == c || a==c) &&(a != b || b != c || a!=c) ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}