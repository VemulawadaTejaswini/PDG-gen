import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String in1=scan.next();
    String in2=scan.next();
    String[] sp1=in1.split("");
    String[] sp2=in2.split("");
    int Ans=0;
    for(int x=0; x<3; x++){
      if(sp1[x].equals(sp2[x])){
        Ans++;
      }
    }
    System.out.println(Ans);
  }
}