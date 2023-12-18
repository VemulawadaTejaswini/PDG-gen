import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();

  int ans=N*(N-1)/2+M*(M-1)/2;
  
  System.out.println(ans);
}
}