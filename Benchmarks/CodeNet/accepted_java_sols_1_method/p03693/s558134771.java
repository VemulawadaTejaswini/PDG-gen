import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{


        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt() * 100 + sc.nextInt() * 10 + sc.nextInt();

        System.out.println(a % 4 == 0? "YES":"NO");

    }
}