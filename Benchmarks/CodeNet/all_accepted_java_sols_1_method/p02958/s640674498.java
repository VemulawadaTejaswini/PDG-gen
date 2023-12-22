import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	int array[] = new int [X];
	int count = 0;
	
	//int array2[] = new int[X];
	
	for(int j=0;j<X;j++) {
		array[j] = sc.nextInt();
		//array2[j] = sc2.nextInt();
		//System.out.println(array[j]);
	}
	
	for(int i=0;i<X;i++) {
		if(array[i]!=i+1)
		count = count+1;
	}
	if(count==2||count==0) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
}
}
