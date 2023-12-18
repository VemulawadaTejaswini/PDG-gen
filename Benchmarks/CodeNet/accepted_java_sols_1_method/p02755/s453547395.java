import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = -1;

        for(int i = 1 ; i <= 10000 ; i++){
            if(8*i/100 == a && i/10 == b){
                x = i;
                break;
            }
        }

        System.out.println(x);
    }
}
