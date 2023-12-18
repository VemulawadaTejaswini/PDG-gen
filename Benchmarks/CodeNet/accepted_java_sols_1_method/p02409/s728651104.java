import java.util.Scanner;

//公舎の入居者数

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		//配列
		int[][][] array = new int[4][3][10];
        //入居者数
        int num = sc.nextInt();
        //座標など入力
        for(int i=0;i<num;i++){
            //座標
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            //座標に入力する数値
            int d = sc.nextInt();
            
            array[a-1][b-1][c-1] += d;
        }
        //表示
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<10;k++){
                    System.out.print(" "+array[i][j][k]);
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
