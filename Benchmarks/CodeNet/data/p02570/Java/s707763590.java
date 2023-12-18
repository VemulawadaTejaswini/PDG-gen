import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int D=sc.nextInt();
    double T=sc.nextInt();
    int S=sc.nextInt();
    double g=(double)(D/(S*1.0));
    if(g <= T){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}