import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a= scan.nextInt();
      	int b= scan.nextInt();
      	int t= scan.nextInt();
      	int num = 0;
      	while(t>=a){
          	t -= a;
        	num++;
        }
        System.out.println(num*b);
    }
}