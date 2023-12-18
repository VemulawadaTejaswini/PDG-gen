import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3,y3,x4,y4;
        int dx=x2-x1; int dy=y2-y1;
        x4=x1+y1-y2; y4=y1+x2-x1;
        x3=x4+dx; y3=y4+dy;
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}
