import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[]l = new int[n];

    int cou = 1;
    int d = 0;
    int a = 0;
    for(int i=0; i<n; i++) {
    	l[i] = sc.nextInt();
    	if(d+l[i] <= x ) {
    		d += l[i];
    		cou++;
    	}else {
    		break;
    	}
    }
    System.out.print(cou);
    }
}
