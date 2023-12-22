import java.util.*;
public class Main {
	public static void main(String[] args){
	 Scanner sc= new Scanner (System.in);
	int a[];
	 a  = new int[10];
	 	for(int b=0;b<10;b++){
	 		a[b]=sc.nextInt();
	 	}

	 
	 Arrays.sort (a);
	System.out.println(a[9]);
	System.out.println(a[8]);
	System.out.println(a[7]);
	
	}

}