import java.util.*;

public class Main {
    List<String> list = new ArrayList<String>();
    Map<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        if(M2 >= M1){
            System.out.println(60 * (H2 - H1) + M2 - M1 - K);
        }else{
            System.out.println(60 * (H2 - H1) - (M1 - M2) - K);
        }
    }
}
