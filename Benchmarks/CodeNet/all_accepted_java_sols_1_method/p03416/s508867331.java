import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int count = 0;
    
    for(int i = A; i <= B; i++){
    	int a = i / 10000;
        int b = i % 10;
        if(a != b) continue;
      	a = (i / 1000)% 10;
        b = (i / 10) % 10;
        if(a == b) count++;
    }
    System.out.println(count);
  }
}