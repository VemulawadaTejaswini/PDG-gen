import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int MAX = 100000;
        int[] counter = new int[MAX];

        for(int i=0;i<N;i++) {
            int num = sc.nextInt()-1;
            counter[num]++;
        }

        int Q=sc.nextInt();
        int[] answers = new int[Q];
        for(int i=0;i<Q;i++) {
            int B=sc.nextInt()-1;
            int C=sc.nextInt()-1;
            counter[C] += counter[B];
            counter[B]=0;
            int total=0;
            for(int j=0; j<MAX; j++) {
                total+=(j+1)*counter[j];
            }
            answers[i] = total;
        }
        for(int inside:answers) {
            System.out.println(inside);
        }
    }

}
