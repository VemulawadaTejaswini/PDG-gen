import java.util.HashMap;
import java.util.Scanner;

// 16
class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 1; i <= N; i++)
            hm.put(sc.nextInt(), i);

            for(int i = 1; i <= N; i++)
                System.out.print(hm.get(i) + " ");
    }

}
