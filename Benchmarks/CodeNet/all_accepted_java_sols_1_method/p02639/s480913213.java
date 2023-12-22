import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 5; i++){
            int x = sc.nextInt();
            if(x == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
