import java.util.*;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sheep = Integer.parseInt(sc.next());
        int wolves = Integer.parseInt(sc.next());

        if(sheep <= wolves) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}