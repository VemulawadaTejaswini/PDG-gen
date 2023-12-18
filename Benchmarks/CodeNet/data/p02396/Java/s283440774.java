import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; ; i++){
            int j = sc.nextInt();
            if (j == 0) break;
            System.out.println("Case " + i + ": " + j);
        }
    }
}
