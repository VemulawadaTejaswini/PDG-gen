import java.util.Scanner;

public class Main {
	
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   while(sc.hasNext()){
	   int n = sc.nextInt();
	   int[] s = new int[n];
	   for(int i = 0;i < n;i++){
		   s[i] = sc.nextInt();
	   }
	   int q = sc.nextInt();
	   int[] t = new int[q];
	   for(int j = 0;j < q;j++){
		   t[j] = sc.nextInt();
	   }
	   int count = 0;
	   for(int k = 0;k < q;k++){
		   for(int l = 0;l < n;l++){
			   if(t[k] == s[l]){
				   count++;
			   }
		   }
	   }
	   System.out.println(count);
     }
   }
}