import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp;
        for(int i=0; i<n; i++){
            int[] hen = new int[3];
            
            for(int j=0;j<3;j++){
                hen[j] = sc.nextInt();
            }
            for(int j=1;j<3;j++){
                for(int k=j;k>0;k--){
                    if(hen[k]>hen[k-1]){
                        temp = hen[k-1];
                        hen[k-1] = hen[k];
                        hen[k] = temp;                        
                    }
                }
            }
            
            if(hen[0]*hen[0]==hen[1]*hen[1] + hen[2]*hen[2])
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
            
        }
    }
}