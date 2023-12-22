import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cnt = sc.nextInt();
      String str = sc.next();
	  //Sの長さを求める
      int len = str.length();
      if(len <= cnt)
      {
      	 System.out.println(str);
      }
      else
      {
      	String new_str = str.substring(0, cnt);
        new_str += "...";
        System.out.println(new_str);
      
      }
    }
}