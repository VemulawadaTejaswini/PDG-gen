import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,i,j,k,b,f,r,v;
        int house[][][]= new int[4][3][10];
        n=input.nextInt();
        for(i=0; i<n; i++){
            b=input.nextInt();
            f=input.nextInt();
            r=input.nextInt();
            v=input.nextInt();
            house[b-1][f-1][r-1]+=v;
        }
        for (i=0;i<4;i++){
            for (j=0;j<3;j++){
                for(k=0;k<10;k++){
                    System.out.print(" "+house[i][j][k]);
                }
                System.out.println();
            }
            if (i < 3){
                System.out.println("####################");
            }
        }
    }
}
