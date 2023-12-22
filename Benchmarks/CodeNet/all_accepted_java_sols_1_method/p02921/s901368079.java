import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int ans=0;
    for(int i=0;i<3;i++){
      if(s1.charAt(i)==s2.charAt(i))
        ans++;
    }
    System.out.println(ans);
  }
}