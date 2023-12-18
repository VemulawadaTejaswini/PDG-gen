import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int V = sn.nextInt();
        int B = sn.nextInt();
        int W = sn.nextInt();
        int T = sn.nextInt();

        if(A == B) System.out.println("Yes");
        else if(V == W) System.out.println("No");
        else if(A < B){
            for(int i=1; i<T+1; i++){
                if(A+(V*(i+1)) == B+(W*(i+1))){
                    System.out.println("Yes");
                    break;
                }else if(A+(V*(i+1)) > B+(W*(i+1))){
                    System.out.println("No");
                    break;
                }
                if(i==T) System.out.println("No");
            }
        }
        else System.out.println("No");
    }
}