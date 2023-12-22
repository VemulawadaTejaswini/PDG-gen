import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    long X=sc.nextLong();
    int count=0;
    int N=100;
    double money=N;
    while (money<X) {
    	money=money*1.01;
    	money=Math.floor(money);
    	count++;
    }
    System.out.println(count);
    }}