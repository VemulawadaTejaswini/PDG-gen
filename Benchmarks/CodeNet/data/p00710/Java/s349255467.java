import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n==0)break;
            
            int[] huda = new int[n+1];
            huda[0] = 0;
            
            for(int i=0; i<n+1; i++){
                huda[i] = n-i+1;
            }
            
            for(int i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                
                int[] temp = new int[c];
                
                for(int j=0; j<c; j++){
                    temp[j] = huda[p+j];
                }
                for(int j=p-1; j>0; j--){
                    huda[j+c] = huda[j];
                }    
                for(int j=0; j<c; j++){
                    huda[j+1] = temp[j];                
                }
                
            }   
            System.out.println(huda[1]);
        }
    }
}