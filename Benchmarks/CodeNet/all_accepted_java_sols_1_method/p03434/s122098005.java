import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int a[] = new int[n];
      	
      	for(int i = 0; i < n; i++)
          a[i] = sc.nextInt();
      	Arrays.sort(a);
      
      	int bob = 0, alice = 0;
      	boolean flag = true;
      	int i = n-1;
      	while(i >= 0){
          if(flag){
            alice += a[i];
          	flag = !flag;
          }else{
            bob +=a[i];
            flag = !flag;
          }
    		i--;
    	}
      	System.out.println(alice - bob);
      	
	}
}