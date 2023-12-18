
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N=scan.nextLong();
        long X=scan.nextLong();

        long M=scan.nextLong();

        long p=0;
for(int i=0;i<N;i++){
    p=p+X;
    X=(long)Math.pow(X%M,2)%M;
}

System.out.println(p);
    }
}
