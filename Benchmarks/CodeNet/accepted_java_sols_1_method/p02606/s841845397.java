import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        int x[] = new int[(R-L)+1];
        x[0] = L;
        if(x[0]%d == 0){
            count++;
        }
        for(int i = 1; i < x.length; i++){
            L++;
            x[i] = L; 
            if(x[i]%d == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
