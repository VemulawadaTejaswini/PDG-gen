import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int sx = Integer.parseInt(S[0]);
    int sy = Integer.parseInt(S[1]);
    int tx = Integer.parseInt(S[2]);
    int ty = Integer.parseInt(S[3]);
    
    int a = tx-sx;
    int b = ty-sy;
    
    String ans = "", ans1 = "", ans2 = "", ans3 = "", ans4 = "";
    for(int i = 0; i < a; i++){
      ans1 += "R";
      ans3 += "L";
    }
    for(int i = 0; i < b; i++){
      ans2 += "U";
      ans4 += "D";
    }
    ans += ans1 + ans2 + ans3 + ans4;
    ans1 = "";
    ans2 = "";
    ans3 = "";
    ans4 = "";
    for(int i = 0; i < a+1; i++){
      ans1 += "R";
      ans3 += "L";
    }
    for(int i = 0; i < b+1; i++){
      ans2 += "U";
      ans4 += "D";
    }
    ans += "D" + ans1 + ans2 + "L" + "U" + ans3 + ans4 + "R";
    System.out.println(ans);
  }
}