
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        ArrayList<Integer> A = new ArrayList();
        for (int I = 0; I < N; I++) {
            A.add(Input.nextInt());
        }
        Collections.sort(A, Collections.reverseOrder());
        int Sum = 0;
        for (int I = 0; I < A.size(); I++) {
            if (I % 2 == 0) {
                Sum += A.get(I);
            } else {
                Sum -= A.get(I);
            }
        }
        System.out.println(Sum);
    }

}
