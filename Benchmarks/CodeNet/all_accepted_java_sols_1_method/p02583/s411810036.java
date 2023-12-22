import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i]=sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N ; j++) {
                for (int k = j+1; k < N; k++) {
                    int a = L[i];
                    int b = L[j];
                    int c = L[k];

                    if(a+b > c && a+c > b &&c+b > a && a!=b && a!=c && c!=b ){
                        count++;
                    }


                }
            }
        }



        System.out.println(count);

    }}