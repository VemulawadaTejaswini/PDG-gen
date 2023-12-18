import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int theta = 90;
        double x = 0;
        double y = 0;
        int d = 0;
        int a = 0;
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(",");
            d = Integer.parseInt(str[0]);
            a = Integer.parseInt(str[1]);
            if(d == 0 && a == 0){
                break;
            }
            x += (double)d * Math.cos((double)theta*Math.PI/180);
            y += (double)a * Math.sin((double)theta*Math.PI/180);
            theta -= a;
        }
        System.out.println((int)x + "\n" + (int)y);
    }
}