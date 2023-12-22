import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    int[]a = new int[n];
    
    int cou = 0;
    for(int i=0; i<n; i++) {
    	a[i] = sc.nextInt();
    	for(int j=0; j<d; j++) {
    		if(a[i]*j+1 <= d) {
    			cou++;
    		}
    	}
    }
    		System.out.println(cou+x);
      }
}

