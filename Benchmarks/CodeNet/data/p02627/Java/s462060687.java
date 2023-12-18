import java.util.*;
class s{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
    while(t-->0){
      char c=obj.next().charAt(0);
      if(Character.isLowerCase(c))
        System.out.println("a");
      else
        System.out.println("A");
    }
  }
}