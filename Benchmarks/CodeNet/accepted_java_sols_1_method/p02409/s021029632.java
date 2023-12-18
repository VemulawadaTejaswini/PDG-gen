import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int building[][][]= new int[4][3][10];
        int n=sc.nextInt();
        while(n-->0){
            building[sc.nextInt()-1][sc.nextInt()-1][sc.nextInt()-1]+=sc.nextInt();
        }
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" "+building[i][j][k]);
                }
                System.out.println();
            }
            if(i<3){
                for (int k = 0; k < 20; k++)System.out.print("#");
                System.out.println();
            }
        }
    }
}


