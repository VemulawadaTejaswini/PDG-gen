import java.util.Scanner;

class Main{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a[] = new int[n];
  for(int i=0;i<n;i++){
   a[i] = sc.nextInt();
  }
  for(int i=a.length-1;i>=0;i--){
   if(i!=a.length-1) System.out.print(" ");
   System.out.print(a[i]);
  }
  System.out.println();
 }
}
