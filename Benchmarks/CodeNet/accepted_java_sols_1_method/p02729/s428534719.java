import java.util.*;

/*
説明
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int count = 0;

        count += n * (n-1) / 2;
        count += m * (m-1) / 2;

        System.out.println(count);
    }
}