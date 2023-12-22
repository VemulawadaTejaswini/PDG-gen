import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

        if(a % 2 == 0) System.out.println(0.5);
        else System.out.println(((float)(a / 2 + 1) / a));

    }

}
