/**
 * Created by kame on 2017/04/15.
 */
/**
 * Created by kame on 2017/04/15.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int result=1;
        int frag=0;
        for(int i=1;i<N;i++){
            if(A[i]-A[i-1]==0){

            }
            if(A[i]-A[i-1]>0){
                if(frag==-1){
                    result++;
                    frag=0;
                    continue;
                }
                frag=1;

            }
            if(A[i]-A[i-1]<0){
                if(frag==1){
                    result++;
                    frag=0;
                    continue;
                }
                frag=-1;
            }
        }
        System.out.println(result);
    }
}