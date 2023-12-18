import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
        int x3=x2-(y2-y1),y3=y2+(x2-x1),x4=x3-(y3-y2),y4=y3+(x3-x2);
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}
