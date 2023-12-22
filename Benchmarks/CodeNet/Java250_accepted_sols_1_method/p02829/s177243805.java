import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int[] abc = {1,2,3};
        for(int i = 0; i < 3; i++) {
            if(abc[i] == a || abc[i] == b) {
                continue;
            }else {
                System.out.println(abc[i]);
            }
        }
        
    }
}