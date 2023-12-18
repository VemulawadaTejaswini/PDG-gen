import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        System.out.println(Math.sqrt(a));
    }
}
