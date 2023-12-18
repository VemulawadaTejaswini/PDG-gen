import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            H -= sc.nextInt();
        }
        if(H<=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
