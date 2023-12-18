import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        switch (n) {
            case 1:
                System.out.print("Hello World\n");
                break;
            case 2:
                int a = sc.nextInt(); int b = sc.nextInt();
                System.out.print(a+b+"\n");
        }


    }

}

