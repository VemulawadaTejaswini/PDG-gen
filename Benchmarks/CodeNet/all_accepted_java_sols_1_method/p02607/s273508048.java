import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        for(int i = 1;i < N + 1;i++){
            int a = sc.nextInt();
            if(a % 2 != 0 && i % 2 != 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}