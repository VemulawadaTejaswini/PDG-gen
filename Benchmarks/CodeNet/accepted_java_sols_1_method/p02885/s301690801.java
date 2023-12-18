import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
    	  String n = sc.nextLine();
          String[] strArray = n.split(" ");
          int K_width = Integer.parseInt(strArray[0]);   //窓
          int karten =  Integer.parseInt(strArray[1]);  //カーテン
          int result = 0;
          
          result = K_width - (karten * 2);
          
          if (result <= 0){
         	  result = 0;
          }
          System.out.println(result);
    }
    }