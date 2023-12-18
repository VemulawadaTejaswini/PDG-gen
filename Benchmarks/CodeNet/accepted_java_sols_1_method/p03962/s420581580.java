import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    
    if(a==b && a==c && b==c){
      System.out.println(1);
    }
    else if(a==c && c!=b && a!=b) {
      System.out.println(2);
    }else if(b==c && c!=a && a!=b){
      System.out.println(2);
    }else if(a==b && a!=c && b!=c){
      System.out.println(2);
    }else if(a!=b && a!=c && b!=c){
      System.out.println(3); 
    }
  }
}