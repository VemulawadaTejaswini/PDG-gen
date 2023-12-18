import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int[] train = new int[2];
        int[] bus = new int[2];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; i < 2;i++){
            train[i] = sc.nextInt();
        }
        for(int j = 0 ; j < 2; j++){
            bus[j] = sc.nextInt();
        }
        System.out.println(Math.min(train[0],train[1]) + Math.min(bus[0],bus[1]));
    }
}
