import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        List<Integer> numList = new ArrayList<>();

        for(int i=0; i<N; i++){
            int input = sc.nextInt();
            A[i] = input;
            numList.add(input);
        }

        numList.sort(Comparator.reverseOrder());

        int max1 = numList.get(0);
        int max2 = numList.get(1);

        for(int i=0; i<N; i++){
            int result;
            if(A[i] != max1) {
                result = max1;
            }else{
                result = max2;
            }

            System.out.println(result);
        }

    }
}
