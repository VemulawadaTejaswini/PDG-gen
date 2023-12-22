import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i < 10; i++){
           for(int j = 1; j < 10; j++){
                if(i*j == num){
                    System.out.println("Yes");
                    return;
                }
            } 
        }
        System.out.println("No");
    }
}
