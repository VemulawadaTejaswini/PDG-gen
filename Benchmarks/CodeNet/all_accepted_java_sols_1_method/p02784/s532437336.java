import java.util.Scanner;
 
public class Main{
 
public static void main(String[] args) {
 
int count = 0;
int H;
int N;
String message = "No";
 
Scanner scanner = new Scanner(System.in);
H = scanner.nextInt();
N = scanner.nextInt();
  
int u[] = new int[N];
  
for(int i = 0; i<N; i++){
  u[i] = scanner.nextInt();
  if(H>0){
    H = H - u[i];
  }
  
}
if(H <= 0){
  message = "Yes";
}
  
System.out.println(message);
  
}
  
}