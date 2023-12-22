import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int XMax = X;
        int YMin = Y;

        for(int i=0; i<N; i++){
            XMax = Math.max(XMax, scanner.nextInt());
        }

        for(int j=0; j<M; j++){
            YMin = Math.min(YMin, scanner.nextInt());
        }

        if(YMin <= XMax){
            System.out.println("War");
        }else{
            System.out.println("No War");
        }
    }
}
