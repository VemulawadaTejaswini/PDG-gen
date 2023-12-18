import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	double d = 0;
      	for(int i=0;i<n;i++){
        	int a = sc.nextInt();
          	d += (double)1/a;
        }
      	System.out.println(1/d);
    }
}