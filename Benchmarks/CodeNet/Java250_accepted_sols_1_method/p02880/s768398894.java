import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> k = new ArrayList<>();
        for(int x = 1; x <= 9;x++){
            for(int y = 1;y <= 9; y++){
                k.add(x*y);
            }
        }
        for(int x :k){
            if(x ==N){
                System.out.println("Yes");
                sc.close();
                return;
            }
        }
        System.out.println("No");
        
        sc.close();
    }
}
