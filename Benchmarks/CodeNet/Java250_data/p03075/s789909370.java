import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {
    		int[] a = new int[5];
    		for(int i=0; i<5; i++) {
    			a[i]=sc.nextInt();
    		}
    		int k = sc.nextInt();
    		boolean flag = true;
    		for(int i=0; i<5; i++) {
    			for(int j=0; j<5; j++) {
    				if(i==j) continue;
    				int dis = Math.abs(a[i]-a[j]);
    				if(dis>k)	flag=false;
    			}
    		}
    		System.out.println(flag? "Yay!" : ":(");
    	}
    }
}