import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int numN = scan.nextInt();
                int numM = scan.nextInt();
                int[][] Like = new int[numN][numM];
                int sum = 0;
                int tmp[] = new int[numM];

                for (int i=0; i<numN; i++) {
                    int numK = scan.nextInt();
                    
                    for ( int j=0; j<numK; j++ ) {
                            Like[i][j] = scan.nextInt();
                            tmp[(Like[i][j]-1)]++;

                    }
                }
                for (int z=0; z<numM; z++) {
                    if ( tmp[z] >= numN ) {
                        sum++;
                    }
                }
                
                System.out.println( sum );
                scan.close();
        }
}
