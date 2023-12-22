import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	
      	int[] a = new int[n];
      	int min = 0;
      	int count = 1;
        for(int i = 0; i < a.length; ++i){
          a[i] = sc.nextInt();
        } 
        min = a[0];
      	for(int i = 0; i <n; i++){
          if(min > a[i]){
            min = a[i];
            count += 1; 
          }
        } 
      System.out.println(count);
        
        }
}
