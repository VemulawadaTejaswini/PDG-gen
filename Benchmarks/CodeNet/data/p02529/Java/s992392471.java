import java.util.Scanner;

public class Main {
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] s = new int[n];
	   for(int i = 0;i < n;i++){
		   s[i] = sc.nextInt();
	   }
	   int q = sc.nextInt();
	   int count = 0;
	   for(int k = 0;k < q;k++){
		   int t = sc.nextInt();
		   for(int l = 0;l < n;l++){
			   if(t == s[l]){
				   count++;
			   }
		   }
	   }
	   System.out.println(count);
     }
}