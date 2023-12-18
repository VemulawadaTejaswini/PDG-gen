import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	int[] a = new int[3];

	for(int i = 0 ; i < 3 ; i++){
	    a[i] = n.nextInt();
	}
	Arrays.sort(a);
	for(int i = 0 ; i < 3 ; i++){
	    if(i == 0) System.out.printf("%d" ,a[i]);
	    else System.out.printf(" %d" ,a[i]);
	}
	System.out.printf("\n");
    }
}