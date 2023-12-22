import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> B = new ArrayList<>();

        for(int i=0; i<N-1; i++){
            B.add(scanner.nextInt());
        }

        int res = 0;
        res = res + B.get(0);
        for(int i=0; i<N-2; i++){
            res = res + Math.min(B.get(i), B.get(i+1));
        }
        res = res + B.get(N-2);

        System.out.println(res);
    }
}