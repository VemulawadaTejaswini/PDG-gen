import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    
    for(int i =1; i <= num; i++){
      int wa = i%10 + i/10%10 + i/100%10 + i/1000%10 + i/10000%10;
      if(wa >= a && wa <= b){
		sum += i;
      }
    }  
    System.out.println(sum);
  }
}