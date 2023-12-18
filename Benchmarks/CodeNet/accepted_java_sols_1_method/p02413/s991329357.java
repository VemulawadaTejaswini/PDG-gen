import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int n[][]=new int[row][col];
        int sum[]=new int [row+1];
        int sum2[]=new int[col+1];
        int sum_R=0,sum_C=0;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                n[i][j]=in.nextInt();
                sum[i]=sum[i]+n[i][j];
         //       System.out.println("j= "+j);
                sum2[j]=sum2[j]+n[i][j];
            }
        }
       // System.out.print("Row: ");
        /*for (int i = 0; i <row; i++) {
            sum_R=sum_R+sum[i];
            System.out.print(sum[i]+" ");
        }*/
       // System.out.println("");
        //System.out.print("Col: ");
        for (int i = 0; i <col; i++) {
            sum_C=sum_C+sum2[i];
         //   System.out.print(sum2[i]+" ");
        }
        //System.out.println("");
       // System.out.println(sum_R);
       // System.out.println(sum_C);
        
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.print(sum[i]);
            System.out.println("");
        }
        for (int i = 0; i < col; i++) {
            System.out.print(sum2[i]+" ");
        }
        System.out.print(sum_C);
        System.out.println("");
    }
}
