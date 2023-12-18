import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int count ;
	static String type;	
	static int [] by;
	static char[] right = {'y','u','i','o','p','h','j','k','l','n','m'};
	static char[] left = {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	
	static void lr(String type) {
		by = new int[type.length()+1];
		by[0] = 0;
		for(int i=1;i<=type.length();i++) {
			int r = Arrays.binarySearch(right, type.charAt(i-1));
			int l = Arrays.binarySearch(left, type.charAt(i-1));	
			if(r>=0) by[i] = 1;
			if(l>=0) by[i] = 2;
		}
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Arrays.sort(right);
    	Arrays.sort(left);
    	while(true) {
    		type = sc.nextLine();
    		if(type.equals("#")) break;
    		count = -1;
    		lr(type);
    		/*for(int i=0;i<=type.length();i++) {
    			System.err.print(by[i]+" ");
    		}*/
    		//System.err.println();
    		for(int i=1;i<=type.length();i++) {
    			if(by[i]!=by[i-1]) count++;
    		}
    		System.out.println(count);
    	}
    }
}

