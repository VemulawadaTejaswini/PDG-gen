import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k, a, b, flag = 0;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(i % k == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}