import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean flag = true;
    
    if( a==b && b==c ){
      flag = false;
    }
    
    if( (a!=b && b!=c) && (a!=c) ){
      flag = false;
    }
    
    if( flag ){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}
