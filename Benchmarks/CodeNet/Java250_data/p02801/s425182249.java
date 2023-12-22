import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String in=scan.next();
    String alpha[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for(int x=0; x<alpha.length-1; x++){
      if(alpha[x].equals(in)){
        System.out.println(alpha[x+1]);
      }
    }
  }
}