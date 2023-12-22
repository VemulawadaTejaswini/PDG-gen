import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    String[] alpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int back=scan.nextInt();
    String in=scan.next();
    String[] sc=in.split("");
    int num=0;
    for(int b=0; b<sc.length; b++){
      for(int a=0;a<alpha.length; a++){
        if(sc[b].equals(alpha[a])){
          num=a;
        }
      }
      if(num+back>=alpha.length){
        num-=alpha.length;
      }
      sc[b]=alpha[num+back];
    }
    for(int a=0; a<sc.length; a++){
      System.out.print(sc[a]);
    }
  }
}