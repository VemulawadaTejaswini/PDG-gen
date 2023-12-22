import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();

        int count = 0;
        long a,b;
        double c;

        for (int i=0;i<N;i++ ){
            a = scan.nextLong();
            b = scan.nextLong();

            c = Math.sqrt(a * a + b * b);

            if(c<=D){
                count++;
            }
        }

    System.out.println(+ count + "");
    }
}
