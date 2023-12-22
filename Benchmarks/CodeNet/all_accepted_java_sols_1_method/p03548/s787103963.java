import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int result = 1 + ((x - (y + 2 * z)) / (y + z));
        System.out.println(result);
        sc.close();
    }
}