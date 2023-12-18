
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int[] ary = new int[10];
    	int i;
    	for(i=0;i<10;i++){
    		ary[i]=sc.nextInt();
    	}
    	Arrays.sort(ary);
    	System.out.println(ary[9]);
    	System.out.println(ary[8]);
    	System.out.println(ary[7]);
    }
}
