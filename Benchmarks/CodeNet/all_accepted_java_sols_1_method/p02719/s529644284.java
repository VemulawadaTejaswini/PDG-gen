import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    boolean flag=true;
    long a=scan.nextLong();
    long b=scan.nextLong();
    long per=a%b;
    if(per>Math.abs(per-b)){
      per=Math.abs(per-b);
    }
    System.out.println(per);
  }
}