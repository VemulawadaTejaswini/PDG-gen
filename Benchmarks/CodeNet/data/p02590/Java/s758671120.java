import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int s = 0;
    int p =200003;
    int[] a = new int[n];
    int[] b = new int[10];
    for(int i =0;i<n;i++){
    	a[i] = sc.nextInt();
    }
    for(int i =0 ;i<n;i++){
    	for(int j =0;j<n;j++){
       	 	if(i<j){
            b[i] = (a[i]*a[j])%p;
        	s= s+b[i];
         }
        }
       }
      System.out.println(s);
    }
}