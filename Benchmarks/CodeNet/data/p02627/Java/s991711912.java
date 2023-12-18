import java.util.*;
class s{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
    while(t-->0){
      String s=obj.nextLine();
      if(s.isLowerCase())
        System.out.println("a");
      else
        System.out.println("A");
    }
  }
}