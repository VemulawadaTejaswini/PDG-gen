import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];

    int cou = 0;
    for(int i=0; i<n; i++) {
    	a[i] = sc.nextInt();
    	if(a[i] != i+1) {
    		cou++;
    	}
    }   	
    if(cou<=2) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
    }
}