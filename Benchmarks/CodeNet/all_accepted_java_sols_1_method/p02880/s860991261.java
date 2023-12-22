import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    String Ans="No";
    for(int x=1; x<10; x++){
      for(int y=1; y<10; y++){
        if(a==x*y){
          Ans="Yes";
        }
      }
    }
    System.out.println(Ans);
  }
}