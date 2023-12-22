import java.util.Scanner;
public class Main{


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        int N = reader.nextInt();
        int M = reader.nextInt();
        int Total =0;
        int b=0;

        for (int i = 0; i <M; i++) {
            int A = reader.nextInt();

             Total +=A;

            if (Total>N){

             b=-1;
            } else {
                b = N-Total;


            }

        }

        System.out.println(b);


    }

}


