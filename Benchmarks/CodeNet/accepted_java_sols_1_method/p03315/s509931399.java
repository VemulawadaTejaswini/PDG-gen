import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String g[] = new String[4];
    int answer = 0;
    g[0] = s.substring(0,1);
    g[1] = s.substring(1,2);
    g[2] = s.substring(2,3);
    g[3] = s.substring(3,4);
    for(int i =0;i<4;i++){
      if(g[i].equals("+")){
        answer = answer +1;
      }else{
        answer = answer -1;
      }
    }
    System.out.println(answer);
  }
  

  
}