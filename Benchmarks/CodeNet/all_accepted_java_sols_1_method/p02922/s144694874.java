import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a;
    int i = 1;
    if(b == 1) {
    	System.out.println(0);
    	return;
    }
    while(sum < b){
      sum += a-1;
      i++;
    }
    System.out.println(i);
  }
}