import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int D=sc.nextInt();
    float T=sc.nextInt();
    int S=sc.nextInt();
    float g=(D/(S*1.0));
    if(g <= T){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}