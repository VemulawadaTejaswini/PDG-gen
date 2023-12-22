import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String f =sc.nextLine();
    String a = sc.nextLine();
    int c=0;
    for(int i=0;i<3;i++){
      if(f.charAt(i)==a.charAt(i)) c++;
    }
    System.out.println(c);
  }
}