import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cd = 0;
        for(int i = 1;i <= num;i++){
            cd+=i;
        }
        System.out.println(cd);
    }
}