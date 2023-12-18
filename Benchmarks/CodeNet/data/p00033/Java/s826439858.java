import java.util.Scanner;

class Main{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int j = 0; j < n; j++){
      int[][] a = new int[10][3];
      for(int i = 0; i < a.length; i++)a[i][0] = sc.nextInt();
      an(a);
      }
  }
      static void an(int[][] a){
    	  boolean is = true;;
    	  for(int i = 1; i < a.length; i++){
    		  a[0][1] = a[0][0];
    		  a[0][3] = 0;
    		  for(int h = 1; h <= 2; h++){
    			  if(a[i][h] > a[i-1][h]);
    			  else is = false;
    		  }
    	  }
    	  if(is)System.out.println("YES");
    	  else System.out.println("NO");
      }
}