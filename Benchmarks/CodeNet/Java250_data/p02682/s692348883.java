import java.util.Scanner;

class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   	int A = sc.nextInt();
    int B = sc.nextInt();
   	int C = sc.nextInt();
   	int K = sc.nextInt();
 	int count=0;
   
   	if(A>=K){
    count=K;
    }
   	else if(A<K&&A+B>=K){
    count=A;}
    else if(A+B<K){
    count=A-(K-A-B);}
 
  System.out.println(count);
 }
}
