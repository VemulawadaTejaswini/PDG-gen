import java.util.Scanner; 

class Main{

 public static void main(String[] args){

 Scanner scan = new Scanner(System.in);

 int A = scan.nextInt();
 int B = scan.nextInt();
 int C = scan.nextInt();
   
 int w = A;
   A = B;
   B = w;
   w = A;
   A = C;
   C = w;
System.out.println(A+" "+B+" "+C);

 }
}