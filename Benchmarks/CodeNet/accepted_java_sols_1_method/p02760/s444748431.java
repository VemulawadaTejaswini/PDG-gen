import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] A = new int[3][3];
        for(int i=0;i<3;i++){
            for(int l=0;l<3;l++){
                A[i][l]=scan.nextInt();
            }
        }
        int b = scan.nextInt();
        for(int p=0;p<b;p++){
            int c = scan.nextInt();
            for(int i=0;i<3;i++){
                for(int l=0;l<3;l++){
                    if(c==A[i][l]){
                        A[i][l]=0;
                    }
                }
            }
        }

        int[] r = new int[8];
        for(int i=0;i<3;i++){
            r[0]+=A[0][i];
            r[1]+=A[1][i];
            r[2]+=A[2][i];
            r[3]+=A[i][0];
            r[4]+=A[i][1];
            r[5]+=A[i][2];
            r[6]+=A[i][i];
            r[7]+=A[2-i][i];
        }
        boolean flg = false;
        for(int i=0;i<8;i++){
            if(r[i]==0){
                flg=true;
                break;
            }
        }
        if(flg){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
