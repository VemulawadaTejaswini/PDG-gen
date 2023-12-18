import java.util.Scanner;
class Main
{
public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
  int n = sc.nextlnt();
  int a[] = new int[n];
  
  for(int i=0; i<n; i++){
   a[i] = sc.nextInt();
   System.out.print(n +" ");
   n--;
   }
 }
}


