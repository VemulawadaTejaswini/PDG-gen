import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int sx = Integer.parseInt(S[0]);
    int sy = Integer.parseInt(S[1]);
    int tx = Integer.parseInt(S[2]);
    int ty = Integer.parseInt(S[3]);
    
    String ans1 = "";
    String ans2 = "";
    String ans3 = "D";
    String ans4 = "U";
    
    for(int i = 0; i < tx - sx; i++){
      ans1 = ans1 + "R";
      ans2 = ans2 + "L";
      ans3 = ans3 + "R";
      ans4 = ans4 + "L";
      if(i+1 == tx-sx){
        ans3 = ans3 + "R";
        ans4 = ans4 + "L";
      }
    }
    
    for(int i = 0; i < ty - sy; i++){
      ans1 = ans1 + "U";
      ans2 = ans2 + "D";
      ans3 = ans3 + "U";
      ans4 = ans4 + "D";
      if(i+1 == ty-sy){
        ans3 = ans3 + "UL";
        ans4 = ans4 + "DR";
      }
    }
    System.out.println(ans1 + ans2 + ans3 + ans4);
  }
}