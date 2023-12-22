import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hasY = false;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.equals("Y")){
                hasY = true;
                break;
            }
        }
        if(!hasY) System.out.println("Three");
        else System.out.println("Four");
        sc.close();

    }

}
