import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();
        int seven = 7;
        if(K % 2 == 0 || K % 5 == 0){
            System.out.println(-1);
        }else{

            for(int i = 1;;i++){
                if(seven % K == 0){
                    System.out.println(i);
                    break;
                }
                seven = (seven * 10) + 7;
            }
        }
    }
}
