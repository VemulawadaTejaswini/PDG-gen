import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int numN = scan.nextInt();
                int[] Length = new int[numN];
                int sum = 0;
                int max=0;
                int tmp=0;

                for (int i=0; i<numN; i++) {
                    Length[i] = scan.nextInt();
                    if ( i == 0 ) {
                        max = Length[i];
                    }
                    else {
                        if ( max < Length[i] ) {
                            tmp = max;
                            max = Length[i];
                            sum = sum + tmp;
                        }
                        else {
                            sum += Length[i];
                        }
                    }
                }

                if ( max < sum ) {
                    System.out.println( "Yes" );
                }
                else {
                    System.out.println( "No" );
                }
                
                scan.close();
        }
}
