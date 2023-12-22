import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0;
    if(n>=105)ans++;
    if(n>=135)ans++;
    if(n>=165)ans++;
    if(n>=189)ans++;
    if(n>=195)ans++;
    System.out.println(ans);
  }
}