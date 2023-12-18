import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] brick = new int[N];

        for(int i = 0; i < N; i++)
          brick[i] = Integer.parseInt(sc.next());

        int count = 1;
        for(int i = 0; i < N; i++){
          if(brick[i] == count)
            count++;
        }

        if(count == 1)
          System.out.println(-1);
        else
          System.out.println(N-count+1);
    }
}