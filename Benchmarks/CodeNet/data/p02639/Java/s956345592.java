import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            int num = sc.nextInt();
            if(num == 0){
                System.out.print(i);
                System.exit(0);
            }
        }
    }
}
