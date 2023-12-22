import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cardValues = new int[n];

        for (int i = 0; i < n; i ++){
            cardValues[i] = sc.nextInt();
        }

        for (int i=0; i < n; i++){
            if (i > 0){
                int targetValue = cardValues[i];

                for (int j = i - 1; j >= 0; j--){
                    if (targetValue < cardValues[j]){
                        cardValues[j + 1] = cardValues[j];
                        cardValues[j] = targetValue;
                    }else break;
                }
            }

            StringJoiner sj = new StringJoiner(" ");
            Arrays.stream(cardValues).forEach(card -> sj.add(String.valueOf(card)));
            System.out.println(sj.toString());
        }
    }

}
