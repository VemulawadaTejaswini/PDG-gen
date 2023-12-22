import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int r=scan.nextInt();
    String n=scan.next();
    String[] echo=n.split("");
    int flag=1;
    if(r%2==1){
      flag=0;
    }else{
      for(int a=0; a<r/2; a++){
        if(!echo[a].equals(echo[a+r/2])){
          flag=0;
        }
      }
    }
    if(flag==1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}