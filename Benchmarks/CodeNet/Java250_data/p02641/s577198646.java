import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        boolean p[]=new boolean[102];
        for(int i=0; i<N; i++){
            p[sc.nextInt()]=true;
         }
        
        for(int i=0; i<51; i++){
            if(p[X-i]==false){
                 System.out.println(X-i);
                break;
            }
            if(p[X+i]==false){
                System.out.println(X+i);
                break;
            }
        }
    }
}