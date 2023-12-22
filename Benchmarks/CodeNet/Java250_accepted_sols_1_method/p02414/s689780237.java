import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num,mid,last,i,j,k;
        num=scan.nextInt();
        mid=scan.nextInt();
        last=scan.nextInt();
        long A[][]=new long[num][mid];
        long B[][]=new long[mid][last];
        long C[][]=new long[num][last];
        for (i=0;i<num;i++) { 
            for (j=0;j<mid;j++) { 
                A[i][j]=scan.nextInt();
            } 
        } 
        for (i=0;i<mid;i++) { 
            for (j=0;j<last;j++) { 
                B[i][j]=scan.nextInt();
            } 
        }
        
        for (i=0;i<num;i++) { 
            for (j=0;j<last;j++) { 
                for (k=0;k<mid;k++) 
                    C[i][j] += A[i][k]*B[k][j]; 
            } 
        } 
        for (i=0;i<num;i++) { 
            for (j=0;j<last-1;j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println(C[i][last-1]);
        } 
    }
}
