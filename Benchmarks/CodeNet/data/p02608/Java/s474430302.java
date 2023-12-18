import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int N = 0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        for(int i = 1;i<N;i++){
            System.out.println(f(i,N));
        }
    }
    
    public static int f(int n,int N){
        int kosuu=0;
        int sahen = 100000;
        for(int i = 1;i<N;i++){
            for(int j = 1;j<N;j++){
                for(int k = 1;k<N;k++){
                    sahen = i*i+j*j+k*k+i*j+j*k+k*i;
                    if(sahen == n){
                        //System.out.println(n + "で" +i+ "と"+ j+"と"+k);
                        kosuu++;
                    }
                    if(sahen >n)break;
                }
           
            }
        
        }
        return kosuu;
    }
}