import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int N = scan.nextInt();
    int A = 0;
    String result = "Yes";
    for(int i=1; i<=N; i++){
    	A = scan.nextInt();
    	H = H-A;
    }
    if(H>0) {
    	result = "No";
    }
    System.out.println(result);
  }
}