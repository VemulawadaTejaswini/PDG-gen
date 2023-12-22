import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a,b;
    a = Integer.parseInt(sc.next()); b = Integer.parseInt(sc.next());
    if(a==2 || b==2){System.out.println("No");}
    else{System.out.println("Yes");}
  }
}