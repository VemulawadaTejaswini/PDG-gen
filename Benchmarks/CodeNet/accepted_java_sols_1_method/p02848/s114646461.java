import java.util.*;
class Main{
  public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     int N=scan.nextInt();
     scan.nextLine();
     String S=scan.nextLine();
    for(int i=0;i<S.length();i++){
      System.out.print((char)(((S.charAt(i)-'A')+N)%26+'A'));
    }
  }
}