import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      	
      int n = sc.nextInt();
      int k = sc.nextInt();
      int q = sc.nextInt();
      int[] a = new int[q];
      int[] ppl = new int[n];
      
      for(int i=0;i<q;i++){
      	a[i] = sc.nextInt();
      }
      
      for(int i=0;i<n;i++){
      	ppl[i] = k - q;
      }
      
      for(int i=0;i<q;i++){
      	ppl[a[i]-1] += 1;
      }
      
      for(int i=0;i<n;i++){
      	if(ppl[i] > 0){
          System.out.println("Yes");
        } else {
          System.out.println("No");	
        }
      }
      
	      
    }
}