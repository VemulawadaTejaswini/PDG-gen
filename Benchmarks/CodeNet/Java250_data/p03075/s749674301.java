import java.util.*;
import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[]antena = new int[5];
        for(int i = 0; i < 5; i++){
            antena[i]=  scan.nextInt();
        }

        int k = scan.nextInt();

        int k0 = 0;
        for(int i = 0; i < 5; i++){

            for(int j = i+1; j < 5; j++){
                k0 = antena[i] - antena[j];
                
                if(k < abs(k0)){
                    System.out.println(":(");
                    return;
                }
            }
        }

        System.out.println("Yay!");
    }
}