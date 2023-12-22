import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	String s = scan.next();

	int[] a = new int[26];
	int[] b = new int[26];
	int max = 0;
	for(int i = 0; i < n; i++){
	    int count = 0;
	    for(int j = i; j >= 0; j--){
		a[s.charAt(j)-97]++;
	    }
	    for(int j = i+1; j < n; j++){
		b[s.charAt(j)-97]++;
	    }
	    for(int j = 0; j < 26; j++){
		if(a[j] >= 1 && b[j] >= 1){
		    count++;
		}
	    }
	    if(count > max){
		max = count;
	    }
	    Arrays.fill(a, 0);
	    Arrays.fill(b, 0);
	}

	System.out.println(max);
    }
}
