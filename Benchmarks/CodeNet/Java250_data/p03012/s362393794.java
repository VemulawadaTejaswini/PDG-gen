import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] W = new int[N];
        for (int i=0; i<N; i++){
            W[i] = sc.nextInt();

        }
        sc.close();

        int first=0,end=0,all=0;
        int min = Integer.MAX_VALUE;
        int a=0,b=0;

        for (int i=0; i<N; i++){
            all += W[i];
        }
        for (int i=0; i<N; i++){
            first += W[i];
            end = all - first;
            if (Math.abs(first - end) < min){
                min = Math.abs(first - end);
                a = first;
                b = end;
            }else{
                break;
            }

        }


        System .out.println(Math.abs(Math.abs(a - b)));

    }
}
