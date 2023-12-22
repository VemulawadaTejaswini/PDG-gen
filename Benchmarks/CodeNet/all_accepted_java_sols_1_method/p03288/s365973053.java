import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        if(R < 1200){
            System.out.println("ABC");
        }else if(1200 <= R && R < 2800){
            System.out.println("ARC");
        }else if(2800 <= R){
            System.out.println("AGC");
        }
    }
}
