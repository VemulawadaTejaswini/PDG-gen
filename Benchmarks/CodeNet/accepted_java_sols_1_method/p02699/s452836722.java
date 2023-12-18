import java.util.*;

public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt(); // 羊
        b = sc.nextInt(); // 狼
        if(a<=b){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }

    }
}