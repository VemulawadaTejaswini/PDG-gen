import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] kan = new int[4][3][10];
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int b=sc.nextInt(),f=sc.nextInt(),r=sc.nextInt(),v=sc.nextInt();
            kan[b-1][f-1][r-1] += v;
        }
        
        for(int i=0;i<4;i++){
            for(int k=0;k<3;k++){
                for(int l=0;l<10;l++){
                    System.out.print(" "+kan[i][k][l]);
                }
                System.out.print("\n");
            }
            if(i!=3){
                System.out.println("####################");
            }
        }
        sc.close();
    }
}

