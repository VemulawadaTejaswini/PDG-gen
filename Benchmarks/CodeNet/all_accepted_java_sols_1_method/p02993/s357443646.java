import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String a=s.next();
    boolean cintinuity=false;
    for(int i=0;i<a.length()-1;i++)if(a.charAt(i)==a.charAt(i+1))cintinuity=true;
    if(cintinuity)System.out.println("Bad");
    else System.out.println("Good");
  }
}