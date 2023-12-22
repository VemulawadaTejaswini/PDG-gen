import java.util.*;
public class Main {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
     int a[] = new int[n];
      boolean h = true;
     for(int i=0; i<n; i++){
		a[i] = sc.nextInt();

       if(a[i]%2==0 && a[i]%3!=0 && a[i]%5!=0){
		    h = false;
       }
     }
      System.out.println(h?"APPROVED":"DENIED");
}
}