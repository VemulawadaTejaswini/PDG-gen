import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    long n=obj.nextLong();
    Strinng s="";
    while(n>0){
      if(n%26!=0)
      s=s+(char)(96+n%26);
      else
        s=(char)(122)+s;
      n=n/26;
    }
    System.out.println(s);
  }
}