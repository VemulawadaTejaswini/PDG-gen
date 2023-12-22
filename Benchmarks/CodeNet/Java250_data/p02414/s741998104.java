import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        long mat1[][]=new long[num1][num2];
        long mat2[][]=new long[num2][num3];
        long Grand_mat[][]=new long[num1][num3];
        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<num2;i++){
            for(int j=0;j<num3;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<num1;i++){
            for(int j=0;j<num3;j++){
                for(int k=0;k<num2;k++){
                    Grand_mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        for (int i=0;i<num1;i++) { 
            for (int j=0;j<num3;j++) {
                System.out.print(Grand_mat[i][j]); 
                if(j<num3-1)
                 System.out.print(" ");
            }
            System.out.println();
        } 
    }
}
