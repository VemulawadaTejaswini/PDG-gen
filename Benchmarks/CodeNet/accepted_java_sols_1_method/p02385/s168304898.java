import java.util.*;
/*ダイスゲーム：上面、前面が指定されたダイスは同一か？
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
//１つめのｃｕｂｅを基準にする
        int upper = sc.nextInt();// = [0];
        int front = sc.nextInt();// = [1];
        int right = sc.nextInt();// = [2];
        int left = sc.nextInt();// = [3];
        int back = sc.nextInt();// = [4];
        int downSide = sc.nextInt();// = [5];
       
//配列に２つめのｃｕｂｅの数字を受取る 
        int [] cubeNum = new int [6];     
        for(int i=0; i<6; i++){
            cubeNum[i] = sc.nextInt();
//            System.out.println(cubeNum[i]);
        }
/* //検証用 
    System.out.print("@" + upper + "#" + cubeNum[0]);
    System.out.print("@" + front + "#" + cubeNum[1]);
    System.out.print("@" + right + "#" + cubeNum[2]);
*/
// while(front != cubeNum[1] && upper != cubeNum[0]){
//転がして調べる方向
         String direction = "N N N N W N N N W N N N E N N N E N N N W N N N";
         String[] compass =direction.split(" ");   
         String yesNo ="No";


        for(int i = 0; i < compass.length; i++){
             if(("S").equals(compass[i])){
                 int forNow = cubeNum[0];//１つ回避
                 cubeNum[0]= cubeNum[4];
                 cubeNum[4]= cubeNum[5];
                 cubeNum[5]= cubeNum[1];
                 cubeNum[1]= forNow;
             }else if(("N").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[1];
                 cubeNum[1]= cubeNum[5];
                 cubeNum[5]= cubeNum[4];
                 cubeNum[4]= forNow;
             }else if(("E").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[3];
                 cubeNum[3]= cubeNum[5];
                 cubeNum[5]= cubeNum[2];
                 cubeNum[2]= forNow;
             }else if(("W").equals(compass[i])){
                 int forNow = cubeNum[0];
                 cubeNum[0]= cubeNum[2];
                 cubeNum[2]= cubeNum[5];
                 cubeNum[5]= cubeNum[3];
                 cubeNum[3]= forNow;
             }

            if(upper == cubeNum[0] && front == cubeNum[1] && right == cubeNum[2] && left == cubeNum[3] && back == cubeNum[4] && downSide == cubeNum[5]){
                yesNo ="Yes";
                break;
            }
        }
           System.out.println(yesNo);
    }
}

