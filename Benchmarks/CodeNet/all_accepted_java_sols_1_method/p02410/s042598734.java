import java.util.*;

public class Main {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] A= new int[n][m];
    int[] B =new int[m];
    
    for(int i=0;i<n;i++){
     for(int  y=0;y<m;y++){
       A[i][y]=sc.nextInt();
     }   
    }
    
    for(int y=0;y<m;y++){
        B[y]=sc.nextInt();
    }
    int[] sul= new int[n];
     for(int i=0;i<n;i++){
     for(int y=0;y<m;y++){
        sul[i]+=A[i][y]*B[y];
     }  
     }
     
     for(int i=0;i<n;i++){
         System.out.println(sul[i]);
     
    }
    
 }
}
