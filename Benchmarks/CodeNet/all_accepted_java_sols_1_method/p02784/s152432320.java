import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int H = scn.nextInt();
        int N = scn.nextInt();
        
        int [] A = new int [N];
        int sum = 0;
        
        for(int i=0;i<N;i++){
            A[i] = scn.nextInt();
            sum += A[i];             
        }
        
        if(sum>=H){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}