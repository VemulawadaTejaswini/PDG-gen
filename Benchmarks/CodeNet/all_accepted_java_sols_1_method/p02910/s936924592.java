import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    String way=scanner.next();
    String[] tap=way.split("");
    String Ans="Yes";
    for(int a=0;a<tap.length;a+=2){
      if(!(tap[a].equals("R")) && !(tap[a].equals("U")) && !(tap[a].equals("D"))){
        if(Ans.equals("Yes")){
          Ans="No";
        }
      }
    }
    for(int a=1;a<tap.length;a+=2){
      if(!(tap[a].equals("L")) && !(tap[a].equals("U")) && !(tap[a].equals("D"))){
        if(Ans.equals("Yes")){
          Ans="No";
        }
      }
    }
    System.out.println(Ans);
  }
}