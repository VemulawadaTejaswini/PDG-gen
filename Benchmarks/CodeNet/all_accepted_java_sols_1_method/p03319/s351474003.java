import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt(),count=1;
    for(int i=0;i<n;i++) {
    	int buff=sc.nextInt();
    }
    for(int i=k;i<n;i+=k-1) {
    	count++;
    	//System.out.println(i);
    }
    System.out.println(count);
  }
}
