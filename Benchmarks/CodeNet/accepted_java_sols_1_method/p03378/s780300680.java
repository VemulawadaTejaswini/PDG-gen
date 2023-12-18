import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[M];
        
        for (int i=0;i<M;i++){
            A[i] = sc.nextInt();
        }
        
        //0 1 2 3 4 5 6
        
        int cost0X = 0;
        int costXN = 0;
        for(int i=0;i<M;i++){
            if(A[i] < X){
                cost0X++;
            }else if(A[i] > X){
                costXN++;
            }
        }
        int ans;
        if (cost0X > costXN){
            ans = costXN;
        }else{
            ans = cost0X;
        }
        System.out.println(ans);
        
    }
    
}
