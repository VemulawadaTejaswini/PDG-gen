import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  final static int max = 100;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int K;
      String S;
       while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      K = Integer.parseInt(list.get(0));
      S = list.get(1);
//      System.out.println(K+S);
      check(K,S);
        scan.close();
    }
  
  public static void check(int k, String s){
    String cutS;
   if(k > max){
      System.err.println("文字が長すぎます。");
   } else if(k >= s.length()){
     System.out.println(s);
     return;
   } else{
     cutS = s.substring(0,k);
     System.out.println(cutS+"...");
     return;
   }
    
  }
}