import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        double[] votes = new double[n];
        double total=0;
        for (int i = 0; i < n; i++) {
            double vote = input.nextDouble();
            total+=vote;
            votes[i] =vote;
        }
        int counter =0;
        for (int i = 0; i < n; i++) {
                double ratio = total/(4*m);

            if( votes[i] >=ratio ){
                counter++;
            }
        }
        if(counter >=m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
