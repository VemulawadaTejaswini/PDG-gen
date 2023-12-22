import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int sum_M =0;

        int[] A = new int[N];
        int sum = 0;
        for (int i=0; i<A.length; i++){
            A[i] = stdIn.nextInt();
            sum += A[i];
        }

        Arrays.sort(A);
        /*for(int i=N-1; i>0; i--){
            System.out.print(A[i]+" ");
        }*/

        double AAA = A[N-M];
        double BBB = (double)sum/((double)M*4.0);
        //System.out.println("\n"+AAA+"\n"+BBB+"\n"+(AAA-BBB));
        if(AAA < BBB ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }




    }
}