import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int counter = 0;
        for(int i = L;i < R+1;i++){
            if(i % d == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
