import java.util.Scanner;

public class Main{

  public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    int N = sc.nextInt();
    int D = sc.nextInt();
    
    int hani = D*2+1;
    
    int answer = N/hani;
    
    if (N%hani!=0){
      answer++;
    }
    
    System.out.println(answer);
  }
}