import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int A=scan.nextInt();
    int B=scan.nextInt();
    int count=0;
    int consent=1;
    while(consent<B){
      consent--;
      consent+=A;
      count++;
    }
    System.out.println(count);
  }
}