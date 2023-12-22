import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    
    String[] Sar = S.split("");
    String[] Tar = T.split("");
    
    int c = 0;
    for(int i = 0; i < S.length(); i++){
      if(!Sar[i].equals(Tar[i])){
        c++;
      }
    }
    System.out.print(c);
  }
}