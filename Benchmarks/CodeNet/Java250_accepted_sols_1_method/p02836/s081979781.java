import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    String in=scan.next();
    String[] input=in.split("");
    int Ans=0;
    for(int a=0; a<input.length/2; a++){
      if(!input[a].equals(input[input.length-1-a])){
        Ans++;
      }
    }
    System.out.println(Ans);
  }
}