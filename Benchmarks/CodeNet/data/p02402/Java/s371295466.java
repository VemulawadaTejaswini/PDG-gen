import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);

      int n = stdIn.nextInt();
      int sum = 0;
      int[] a = new int[n];

      for(int i = 0; i < n; i++){
    	  a[i] = stdIn.nextInt();

    	  sum += a[i];
      }

      System.out.print(least(a) + " ");
      System.out.print(most(a) + " ");
      System.out.print(sum);
   }

   static int most(int[] a){
	   int max = a[0];
	   for(int j = 1; j < a.length; j++){
		   if(max < a[j])
			   max = a[j];
	   }
	   return max;
   }

   static int least(int[] a){
	   int min = a[0];
	   for(int j = 1; j < a.length; j++){
		   if(min > a[j])
			   min = a[j];
	   }
	   return min;
   }
}