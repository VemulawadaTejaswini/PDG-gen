import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[]a = new int[n];
 
    int all = 0;
    for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
        all += a[i];
    }
    int cou = 0;
    for(int i=0; i<n; i++){
        if(a[i] >= (double)all/(4*m)) {
        	cou++;
        }
    }
       if(cou>=m) {
    	   System.out.println("Yes");
       }else {
    	   System.out.println("No");
       }
    }
}
