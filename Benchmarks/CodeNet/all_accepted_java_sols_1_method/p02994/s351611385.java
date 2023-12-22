import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int L = sc.nextInt();

            int[] flavors = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                flavors[i] = L + i;
            }

            if ((flavors[0] < 0 && flavors[N-1] == 0) || (flavors[0] < 0 && flavors[N-1] < 0) ){
                for (int i = 0; i < N - 1; i++)
                    sum += flavors[i];
            }else if ((flavors[0] == 0 && flavors[N-1] > 0) || (flavors[0] > 0 && flavors[N-1] > 0) ){
                for (int i = 1; i < N; i++) {
                    sum += flavors[i];
                }
            }else if (flavors[0] < 0 && flavors[N-1] > 0){
                for (int i = 0; i < N; i++) {
                    if (flavors[i] == 0)
                        continue;
                    sum+= flavors[i];
                }
            }

            System.out.println(sum);


        }


    }
}