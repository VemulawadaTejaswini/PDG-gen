import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float d = in.nextFloat();
        float t = in.nextFloat();
        float s = in.nextFloat();
        
        if(d/s > t) System.out.println("No");
        else System.out.println("Yes");
    }
}