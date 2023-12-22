import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 0;
        int c = 0;	
        for(int i=0;i<a;i++){int d = sc.nextInt();
                             b+=d; 
                             c+=d*d;
                            }        	      
		System.out.println((b*b-c)/2);
	}
}
