import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    int count=0; 
    double B=0;
    for(int i=1;i<=A;i++){
    	if(i%2==1){
        	count++;
        }
    }
    B=count/A;
    System.out.println(B);
  }
}