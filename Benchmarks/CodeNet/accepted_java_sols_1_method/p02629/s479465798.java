import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long M;
    int m;
    int x=0;
    String ans1 ="0";
    String T[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    while(N>0){
      M=N%26; if(M==0){M=26;}
      m =(int) M;
      ans1 =T[m-1] + ans1;
      N =(N-m)/26;
      x=x+1;}
    String ans =ans1.substring(0,x);
    System.out.println(ans);
  }
}