import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        switch(N) {
            case 3: case 5: case 7:
                System.out.println(String.format("YES"));
                break;
            default:
                System.out.println(String.format("NO"));
                break;
        }
    }
}
