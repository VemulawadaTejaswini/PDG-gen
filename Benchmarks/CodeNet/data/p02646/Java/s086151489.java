import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        long A = sn.nextLong();
        long V = sn.nextLong();
        long B = sn.nextLong();
        long W = sn.nextLong();
        long T = sn.nextLong();

        if(V == W) System.out.println("NO");
        else{
            for(int i=0; i<T; i++){
                if(A+(V*(i+1)) == B+(W*(i+1))){
                    System.out.println("YES");
                    break;
                }
                if(i==T-1) System.out.println("NO");
            }
        }
    }
}