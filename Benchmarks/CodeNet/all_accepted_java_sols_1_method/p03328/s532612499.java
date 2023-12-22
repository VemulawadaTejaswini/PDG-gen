import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = 0;

        for(int i=1; i<=b-a; i++){
            h += i;
        }
        System.out.println(h - b);
    }
}