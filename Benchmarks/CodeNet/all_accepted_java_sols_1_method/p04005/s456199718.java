import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long[] abc = new long[3];
        boolean div2 = false;
        for(int i = 0; i < 3; i++){
            abc[i] = sc.nextLong();
            if(abc[i] % 2 == 0){
                div2 = true;
            }
        }
        Arrays.sort(abc);
        System.out.println(div2 ? 0 : abc[0] * abc[1]);
    }
}
