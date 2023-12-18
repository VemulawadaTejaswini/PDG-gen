import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int inp;
    for(int a=0; a<5; a++){
      inp=scan.nextInt();
      if(inp==0){
        System.out.println(a+1);
      } 
    }
  }
}
