import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int h = s/3600;
        int m = (s-(h*3600))/60;
        s = s-h*3600-m*60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
