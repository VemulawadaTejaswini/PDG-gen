import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    scan.nextLine();
    String S=scan.nextLine();
    if((N!=1)&&(N%2==0)){
      if((S.substring(0,N/2)).equals(S.substring(N/2,N))){
        System.out.println("Yes");
        System.exit(0);
      }
    }
    System.out.println("No");
  }
}