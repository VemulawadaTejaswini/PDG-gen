import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        if(a <= 5){
            System.out.println(0);
        }else if(a <= 12){
            System.out.println(b/2);
        }else{
            System.out.println(b);
        }
    }
}