import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a+b+c!=17){
      System.out.println("NO");
    }else{
      if((a==5 || a==7)&&(b==5 || b==7)){
        System.out.println("YES");
      }
    }
  }
}
