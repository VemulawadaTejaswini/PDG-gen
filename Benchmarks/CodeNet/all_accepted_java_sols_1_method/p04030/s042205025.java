import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      int i = 0;
      while(i < 10){
          S = S.replace("0B","");
          S = S.replace("1B","");
          i++;
      }
      System.out.println(S.replace("B",""));
	}
}
