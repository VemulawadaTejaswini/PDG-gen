import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = a-1;
    if(a<=b){
      count++;
    }
    System.out.println(count);
  }
}