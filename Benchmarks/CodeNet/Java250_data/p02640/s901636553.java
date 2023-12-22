import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        float b = (y-2*x) / 2;
        float a = (x-b);

        if(b>=0 && b==(int)b) {

        } else {
            System.out.print("No");
            return;
        }

        if(a>=0 && a==(int)a) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        return;
    }
}