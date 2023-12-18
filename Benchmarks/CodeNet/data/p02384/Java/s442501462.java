import java.util.*;
/*ダイスゲーム：上面、前面が指定されたとき右側の目は？
*/
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);

        int upper;// = [0];
        int front;// = [1];
        int right;// = [2];
        int left;// = [3];
        int back;// = [4];
        int downSide;// = [5];
       
//リストにｃｕｂｅの数字を受取る
/*検証用
        int [] cubeNum = new int [6];     
        for(int i=0; i<6; i++){
            cubeNum[i] = i+1;
        }
*/        
        int [] cubeNum = new int [6];     
        for(int i=0; i<6; i++){
            cubeNum[i] = sc.nextInt();
        }
        
        int num =sc.nextInt();//回す回数
        for(int i = 0; i<num; i++){
        upper =sc.nextInt();
        front = sc.nextInt();
        
//検証用 
//    System.out.print("@" + num + "@");
//    System.out.print("@" + upper + "@");
 //   System.out.print("@" + front + "@");

/*
        [1]         
     [4][2][3][5]
        [6]          
upper / front  back / downSide 
        [0]         
     [3][1][2][4]
        [5]          
*/

//     for(int j = 0; j < num; j++){    

         if(upper == cubeNum[0]){
             if(front == cubeNum[1]){
                 System.out.println(cubeNum[2]);
             }else if(front == cubeNum[2]){
                 System.out.println(cubeNum[4]);
             }else if(front == cubeNum[4]){
                 System.out.println(cubeNum[3]);
             }else if(front == cubeNum[3]){
                 System.out.println(cubeNum[1]);
             }
         }
         if(upper == cubeNum[1]){
             if(front == cubeNum[5]){
                 System.out.println(cubeNum[2]);
             }else if(front == cubeNum[2]){
                 System.out.println(cubeNum[0]);
             }else if(front == cubeNum[0]){
                 System.out.println(cubeNum[3]);
             }else if(front == cubeNum[3]){
                 System.out.println(cubeNum[5]);
             }
         }
         if(upper == cubeNum[2]){
             if(front == cubeNum[1]){
                 System.out.println(cubeNum[5]);
             }else if(front == cubeNum[5]){
                 System.out.println(cubeNum[4]);
             }else if(front == cubeNum[4]){
                 System.out.println(cubeNum[0]);
             }else if(front == cubeNum[0]){
                 System.out.println(cubeNum[1]);
             }
          }
          if(upper == cubeNum[3]){
             if(front == cubeNum[1]){
                 System.out.println(cubeNum[0]);
             }else if(front == cubeNum[0]){
                 System.out.println(cubeNum[4]);
             }else if(front == cubeNum[4]){
                 System.out.println(cubeNum[5]);
             }else if(front == cubeNum[5]){
                 System.out.println(cubeNum[1]);
             }
          }
          if(upper == cubeNum[4]){
             if(front == cubeNum[3]){
                 System.out.println(cubeNum[0]);
             }else if(front == cubeNum[0]){
                 System.out.println(cubeNum[2]);
             }else if(front == cubeNum[2]){
                 System.out.println(cubeNum[5]);
             }else if(front == cubeNum[5]){
                 System.out.println(cubeNum[3]);
             }
         }
         if(upper == cubeNum[5]){
             if(front == cubeNum[3]){
                 System.out.println(cubeNum[4]);
             }else if(front == cubeNum[4]){
                 System.out.println(cubeNum[2]);
             }else if(front == cubeNum[2]){
                 System.out.println(cubeNum[1]);
             }else if(front == cubeNum[1]){
                 System.out.println(cubeNum[3]);
             }
         }
        }
    }
}

