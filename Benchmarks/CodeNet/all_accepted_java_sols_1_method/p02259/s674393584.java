import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numberArray = new int[n];

        for (int i = 0; i < n; i++){
            numberArray[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i  < n; i++){
            for (int j = n -1; j > 0; j --){
                int rightInt = numberArray[j];
                int leftInt = numberArray[j - 1];
                if(rightInt < leftInt){
                    numberArray[j] = leftInt;
                    numberArray[j - 1] = rightInt;
                    count++;
                }
            }
        }

        // Array出力
        StringJoiner sj = new StringJoiner(" ");
        Arrays.stream(numberArray).forEach(i -> sj.add(String.valueOf(i)));
        System.out.println(sj.toString()); // => 1,2,3,4,5

        System.out.println(count);



    }

}
