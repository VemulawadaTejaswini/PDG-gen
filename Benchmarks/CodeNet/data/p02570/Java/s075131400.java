import java.util.*;
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
      int D = sc.nextInt();
      int T = sc.nextInt();
      int S = sc.nextInt();
      int time = D/S;
      String anser = "";
      //余りがある場合は繰り上げ
      int amari = D%S;
    if(amari>0){
      time += 1;
    }else{

    }
    
    if(time<=T){
      anser = "Yes";
    }else{
      anser = "No";
    }
      System.out.println(anser);   
  }
}