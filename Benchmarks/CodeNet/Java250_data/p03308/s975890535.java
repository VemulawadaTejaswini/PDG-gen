import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();
        int[] val= new int[N];
       for(int x=0; x<N; x++)val[x]=scanner.nextInt();
        Arrays.sort(val);
        System.out.println(val[N-1]-val[0]);
    }

}
