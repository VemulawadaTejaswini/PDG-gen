    import java.util.Scanner;
    import java.util.ArrayList;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
          int mojilen = sc.nextInt();
          String c2 = sc.next();
		  String[] strArray = c2.split("",0);  
          int c = 0;	//カウンタ
          //空文字挿入
          ArrayList<String> array = new ArrayList<String>();
          loop: for(int i=0;i<=mojilen-1;i++) {
            array.add(new String(strArray[i]));
          }
          array.add(new String(" "));
          
          //判定
          loop: for(int i=0;i<=mojilen-1;i++) {
           		if (array.get(i).equals(array.get(i+1))) {
                	//等しいとき
           	}
          	else {
              		//等しくないとき
            		c++;
         		}
          }
          System.out.println(c);
        }
    }