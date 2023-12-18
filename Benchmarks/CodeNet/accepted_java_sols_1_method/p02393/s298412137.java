import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b > c){
            int temp = b;
            b = c;
            c = temp;
        }
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a +" "+ b +" "+ c);
    }
}
