import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int min1 = 2001;
        for(int i=0; i<3; i++) min1 = Math.min(min1,sc.nextInt());
        int min2 = 2001;
        for(int i=0; i<2; i++) min2 = Math.min(min2,sc.nextInt());
        System.out.println(min1+min2-50);
    }
}