import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        //4棟・3階・10部屋の3次元配列
        int[][][] array = new int[4][3][10];
        
        for(int i=0;i<n;i++){
            //棟
            int b = Integer.parseInt(sc.next());
            //階
            int f = Integer.parseInt(sc.next());
            //部屋
            int r = Integer.parseInt(sc.next());
            //人数
            int v = Integer.parseInt(sc.next());
            //3次元配列に人数を追加
            int before = array[b-1][f-1][r-1];
            array[b-1][f-1][r-1] = before + v;
        }
        //出力
        //棟
        for(int i=0; i<4; i++){
            //階
            for(int j=0; j<3; j++){
                //部屋
                for(int k=0; k<10; k++){
                    System.out.print(" "+array[i][j][k]);
                }
                System.out.println("");
            }
            if(i<3)System.out.println("####################");
        }
        
    }

}

