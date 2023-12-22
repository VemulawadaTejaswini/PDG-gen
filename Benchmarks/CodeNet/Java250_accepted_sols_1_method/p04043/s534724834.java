import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int five = 0;
        int seven = 0;
        for (int i = 0; i < 3; i++) {
            int t = in.nextInt();
            if(t == 5) five++;
            if(t == 7) seven++;
        }
        if(five == 2 && seven == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
