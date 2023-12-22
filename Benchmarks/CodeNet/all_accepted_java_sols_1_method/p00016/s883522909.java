import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double x=0.0,y=0.0;
        double angle = Math.PI/2.0;
        while(true){
            String[] str = sc.nextLine().split(",");
            if(str[0].equals("0")&&str[1].equals("0"))break;
            int r=Integer.parseInt(str[0]);
            int t=(-1)*Integer.parseInt(str[1]);
            x+=(double)r*Math.cos(angle);
            y+=(double)r*Math.sin(angle);
            angle += (double)t*Math.PI/180;
        }
        System.out.println((int)x);
        System.out.println((int)y);
    }
}