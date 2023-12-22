import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i,j;
        
        while(true){
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==0 && m==0){
            break;
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(((j+i)%2)==0){
                    System.out.printf("#");
                }else{
                System.out.printf(".");
                }
                
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}
