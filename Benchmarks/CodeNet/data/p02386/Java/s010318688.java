import java.util.*;
import java.lang.*;
/*ダイスゲーム：複数のダイスは全て異なるか？
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
//        public enum side {upper,front,right,left,back,downSide};
        
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//サイコロの数
        int[][] cube = new int[num][6];//課題の異なるサイコロを入れる箱の大きさ
        int[] cubeNum = new int[6];//詠み込んで比べるサイコロ
        int[] faceSide = new int[6];//cubeからとってきて各面を比べるためのサイコロ
        String yesNo ="Yes";//全部違う場合に表示        

//全部のサイコロをｃｕｂｅに入れる
         for(int i = 0; i < num; i++){
            for(int j = 0; j < 6; j++){
                cube[i][j]= sc.nextInt();
//                System.out.print("cube " + cube[i][j]);
            }
 //            System.out.println();
         }

//ｃｕｂｅＮｕｍでひとつづつ比較        
        for(int i = 0; i < num-1; i++){
            faceSide= cube[i];
            for( int j = i+1; j < num; j++){
                cubeNum=cube[j];
                for(int k = 0; k < num; k++){
                    
//検証用     System.out.println("faceSide " + faceSide[i]);  
//検証用    System.out.println("cubeNum " + cubeNum[i]);                                    
                        
//転がして調べる方向
            String direction = "N N N N W N N N W N N N E N N N E N N N W N N N";
            String[] compass =direction.split(" ");   
//Dice 1 と同じ
            for(int l = 0; l < compass.length; l++){
                 if(("S").equals(compass[l])){
                     int forNow = cubeNum[0];//１つ回避
                     cubeNum[0]= cubeNum[4];
                     cubeNum[4]= cubeNum[5];
                     cubeNum[5]= cubeNum[1];
                     cubeNum[1]= forNow;
                 }else if(("N").equals(compass[l])){
                     int forNow = cubeNum[0];
                     cubeNum[0]= cubeNum[1];
                     cubeNum[1]= cubeNum[5];
                     cubeNum[5]= cubeNum[4];
                     cubeNum[4]= forNow;
                 }else if(("E").equals(compass[l])){
                     int forNow = cubeNum[0];
                     cubeNum[0]= cubeNum[3];
                     cubeNum[3]= cubeNum[5];
                     cubeNum[5]= cubeNum[2];
                     cubeNum[2]= forNow;
                 }else if(("W").equals(compass[l])){
                     int forNow = cubeNum[0];
                     cubeNum[0]= cubeNum[2];
                     cubeNum[2]= cubeNum[5];
                     cubeNum[5]= cubeNum[3];
                     cubeNum[3]= forNow;
                 }/*
                 System.out.print(cubeNum[0]);
                 System.out.print(cubeNum[1]);
                 System.out.print(cubeNum[2]);
                 System.out.print(cubeNum[3]);
                 System.out.print(cubeNum[4]);
                 System.out.print(cubeNum[5]);
*/                 
                 if(faceSide[0] == cubeNum[0] && faceSide[1] == cubeNum[1] && faceSide[2] == cubeNum[2] && faceSide[3] == cubeNum[3] && faceSide[4] == cubeNum[4] && faceSide[5] == cubeNum[5]){
                    yesNo ="No";
                    break;
                 }//  System.out.println();
            }
            }
            }
        }System.out.println(yesNo);
    }
}

