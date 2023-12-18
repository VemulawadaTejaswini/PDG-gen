import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();
      long n = sc.nextInt();
      
      for (long i = 0; i < n; i++){
        a += b;
        c += d;
      }
      if (c > a){
		System.out.println("NO");
      }else{
        System.out.println("YES");
      }
   }
}