import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // n円
        int n = Integer.parseInt(sc.next());
        // 1円玉の枚数
        int a = Integer.parseInt(sc.next());
        // n円を500円で割った余りが、1円玉の枚数以下ならyes
        if(n % 500 <= a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
