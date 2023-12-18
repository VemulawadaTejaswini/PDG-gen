import java.util.Scanner;
class Main{
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 int b = 0;
 int N = scan.nextInt();
 int M = scan.nextInt();  
	for (int i = 0; i < M; i++){
      int a = scan.nextInt();
      b = a + b;
    }
  if (N - b >= 0){
    System.out.println(N-b);
  }
  else{
    System.out.println("-1");
  }
   
 }
}