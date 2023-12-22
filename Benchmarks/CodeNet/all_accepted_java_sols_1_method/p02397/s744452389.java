import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 0 && b == 0)
                break;
            if (a < b)
                System.out.println(a+" "+b);
            else
                System.out.println(b+" "+a);
        }
    }
}
