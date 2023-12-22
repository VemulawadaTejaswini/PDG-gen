import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();    	
      	int[] a = new int[n];
      	int mid = 0;
      	int count = 0;
        for(int i = 0; i < a.length; ++i){
          a[i] = sc.nextInt();
        } 
        for(int i = 0; i <(n-2); i++){
            mid = a[(i+1)];
            if(mid > a[i] && mid < a[(i+2)]){
            count += 1; 
            }if(mid < a[i] && mid > a[(i+2)]){
            count += 1; 
            }
        }
         System.out.println(count);
    }
}
