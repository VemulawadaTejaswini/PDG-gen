import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int res[] = new int[T+1];
        int ini,fin;
        for (int i = 0; i < N; i++) {
            ini=in.nextInt();
            fin=in.nextInt();
            for (int j = ini; j < fin; j++) {
                res[j]++;    
            }
        }
        int max=0;
        for (int i = 0; i < T; i++) {
            if(res[i]>max){
                max=res[i];
            }
        }
        System.out.println(max);
    }
    
}
