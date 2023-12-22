import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      	int length = sc.nextInt();
      	int a[] = new int[length];
  		int b[] = new int[length - 1];
      	int a_sum = 0;
      
     	for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();
      
      	a[0] = b[0];      
      	
      	for(int i = 1;i < length-1; i++){
        	if(b[i - 1] < b[i]) a[i] = b[i -1];
            else a[i] = b[i];
        }
      
      	a[length -1] = b[length -2];
      
      	for(int num: a) a_sum += num;
     
        System.out.println(a_sum);
        
	}
}
