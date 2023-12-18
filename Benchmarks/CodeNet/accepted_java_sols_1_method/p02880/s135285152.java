import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // スペース区切りの整数の入力
      int N = sc.nextInt();


        boolean Flg_99=false;
        for (int i=1;i<10;i++){
          for (int s=1;s<10;s++){
            if (N==i*s){
              Flg_99=true;
            }
          }
        }
      
      if (Flg_99){       
        System.out.println("Yes");
      }else{
        System.out.println("No");      
      }
   }
}

