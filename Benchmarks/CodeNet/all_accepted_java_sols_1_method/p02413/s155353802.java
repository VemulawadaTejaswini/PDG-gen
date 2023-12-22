import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          int r=sc.nextInt();
          int c=sc.nextInt();
          int[][]t=new int[r+1][c+1];
           
          for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    t[i][j]=sc.nextInt();
                }
            }
         int sum=0;
       	 for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    t[i][c]+=t[i][j];
                   sum+=t[i][j];
                }
            }
         t[r][c]=sum;
         for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    t[r][j]+=t[i][j];
                }
            }
        
     	for(int i=0;i<r+1;i++){
           for(int j=0;j<c+1;j++){
              System.out.print(t[i][j]);
              if(j!=c)System.out.print(" ");
           }
         System.out.println();
        }
        sc.close(); 
  }
}

