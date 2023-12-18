import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    String b=scan.next();
    int Ans=0;
    String in[]=new String[a];
    in=b.split("");
    for(int x=0; x<a-2; x++){
      if(in[x].equals("A") && in[x+1].equals("B") && in[x+2].equals("C")){
        Ans++;
      }
    }
    System.out.println(Ans);
  }
}