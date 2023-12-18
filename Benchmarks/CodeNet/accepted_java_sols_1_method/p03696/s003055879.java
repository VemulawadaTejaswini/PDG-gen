import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    int r = 0;
    int l = 0;         
    for(int i=0;i<n;i++){
      if(r==0&&s[i]==')')l++;
      if(s[i]=='(')r++;
      if(r>0&&s[i]==')')r--;
    }
    for(int i=0;i<l;i++)System.out.print("(");
    System.out.print(String.valueOf(s));
    for(int i=0;i<r;i++)System.out.print(")");
    System.out.println("");
  }
}
