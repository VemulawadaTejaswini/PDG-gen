import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = (A + B)/2;

        if((A + B) % 2 == 0){
            System.out.println(result);
        }else{
            System.out.println("IMPOSSIBLE");
        }


    }
}
