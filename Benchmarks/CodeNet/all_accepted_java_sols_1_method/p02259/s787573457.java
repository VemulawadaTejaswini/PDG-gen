import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        ArrayList<Integer> a = new ArrayList<Integer>();
        int count = 0;
        int temp;

        N = sc.nextInt();

        for(int i = 0; i < N; i++){
            a.add(sc.nextInt());
        }

        for(int i = 0; i < N; i++){
            for(int j = 1; j < N; j++){
                if(a.get(j - 1) > a.get(j)){
                    temp = a.get(j - 1);
                    a.set(j - 1, a.get(j));
                    a.set(j, temp);
                    count++;
                }
            }
        }

        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i));
            if(i != a.size() - 1) System.out.print(" ");
        }
        System.out.println("\n" + count);

        sc.close();
    }
}
