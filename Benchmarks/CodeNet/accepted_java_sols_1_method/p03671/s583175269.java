import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] abc = {a, b, c};
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}