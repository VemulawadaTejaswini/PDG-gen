    import java.util.Scanner;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
          boolean b1 = false;		//九九フラグ
    	  int n = sc.nextInt();
          int m = 0;		//掛け算計算用変数
          //九九判定
          if (n > 81 || n <= 0) {
            System.out.println("No");
            return;
          }
         loop: for(int i=1;i<10;i++) {
           		for(int j=1;j<10;j++) {
                  m = i * j;
                    //等価判定
       				if (java.util.Objects.equals(m,n)) {
              				b1 = true;
                      		break loop;
                    }
                }
         } 
      if (b1 == true){
       System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }         
      }
    }