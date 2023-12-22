import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    if(s==1 || s==2){
      System.out.print(4);
      return;
    }
    int a=s;
    int b=s;
    int count=1;
    while(a!=4){
      if(b%2==0){
      	a=b/2;
      }else{
      	a=3*b+1;
      }
      b=a;
      count++;
    }
    System.out.print(count+3);
  }
}