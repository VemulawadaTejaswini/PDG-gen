import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int V = sn.nextInt();
        int B = sn.nextInt();
        int W = sn.nextInt();
        int T = sn.nextInt();

        if(V == W) System.out.println("NO");
        else{
            for(int i=0; i<T; i++){
                if(A+(V*(i+1)) == B+(W*(i+1))){
                    System.out.println(i+"YES");
                    break;
                }
                if(i==T-1) System.out.println("NO");
            }
        }
    }
}