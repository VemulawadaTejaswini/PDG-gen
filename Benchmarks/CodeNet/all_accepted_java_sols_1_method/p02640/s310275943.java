import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    String ans = "No";
    for(int i=0; i<=x; i++){
      int leg = i*2 + (x-i)*4;
      if(y == leg){
        ans = "Yes";
      }
    }
    System.out.println(ans);

    sc.close();
  }
}
