import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
      String s = sc.next();
      boolean jud = true;
	  String[] st = new String[4];
      
      for(int i=0; i<4;i++){
        st[i] = s.substring(i,i+1);
      }
      for(int i=0;i<3;i++){
        if(st[i].equals(st[i+1])){
          jud = false;
        }
      }
      if(jud){
        System.out.println("Good");
	}else{
        System.out.println("Bad");
      }
    }
}