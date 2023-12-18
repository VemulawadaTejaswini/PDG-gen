import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int[] ae = new int[5]; 
        for(int i = 0; i < 5; i++){
            ae[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        if( ae[4] - ae[0] > k ){
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
