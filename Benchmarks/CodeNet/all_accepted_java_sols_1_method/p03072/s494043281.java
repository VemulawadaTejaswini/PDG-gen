import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      	int[] a=new int[n];
      
      for(int i=0;i<n;i++){
        a[i]=scan.nextInt();
      }
      
      int max=0;
      int count = 0;
      
      for(int i=0;i<n;i++){
        if(a[i]>=max){
          max=a[i];
          count=count+1;
        }
      }

        		System.out.println(count);
        
 
 
	}
}