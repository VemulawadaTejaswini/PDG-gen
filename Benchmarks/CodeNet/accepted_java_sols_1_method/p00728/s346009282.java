import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n!=0){
                int max=0, min=1000;
                int average=0;
                for (int i = 0; i < n; i++) {
                    int scores = sc.nextInt();
                    average += scores;
                    if(scores >= max){
                        max=scores;
                    }
                    if(scores <= min){
                        min=scores;
                    }
                }
                average=average-max-min;
                average /= (n-2);
                System.out.println(average);
                n = sc.nextInt();
            }
        }
    }
}

