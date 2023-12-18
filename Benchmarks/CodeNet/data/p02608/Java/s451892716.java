import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i =1;i <=n;i++ ) {
        	int count = 0;
        	for(int x =1; x*x <i;x++) {
        		for(int y =x; y*y <i;y++) {
        			for(int z =y; z*z <i;z++) {
                		int f =x*x+y*y+z*z+x*y+y*z+z*x;
                		if(f==i) {
                			if((x==y) && (y==z)) {
                				count++;
                    			break;
                			}
                			else {
                				count = count +3;
                    			break;
                			}
     
                		}
                	}
        		}
        	}
        	result.add(count);
        }
        for(int a:result) {
        	System.out.println(a);
        }
    }

}