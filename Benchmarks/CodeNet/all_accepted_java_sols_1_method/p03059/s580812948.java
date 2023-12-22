import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int byTime = sn.nextInt();
        int count = sn.nextInt();
        double limitTime = sn.nextInt() + 0.5;
        
        System.out.println((int)(limitTime / byTime) * count);
        
    }
}