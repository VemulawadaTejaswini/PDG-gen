import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        if((b-a) % 2 != 0){
            System.out.println("IMPOSSIBLE");
        }else{
            System.out.println((b-a) / 2 + a);
        }
    }
}