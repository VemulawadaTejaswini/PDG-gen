import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i,j,k=0;
        int harr[][][]=new int[4][3][10];
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(i=0;i<n;i++){
            int b=sc.nextInt(); 
            int f=sc.nextInt(); 
            int r=sc.nextInt(); 
            int v=sc.nextInt(); 
            harr[b-1][f-1][r-1]+=v;
        }

        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                for(k=0;k<10;k++){
                    System.out.printf(" %d",harr[i][j][k]);
                }
                System.out.println();
            }
            if(i!=3){
                System.out.println("####################");
            }
        }
        sc.close();
    }    
}
