import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x; i++) {
        	a[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        int[] b = new int[y];
        for(int i=0; i<y; i++) {
        	b[i] = sc.nextInt();
        }

        int[]c = new int[y];

        for(int i=0; i<y; i++) {
        	for(int j=0; j<x; j++) {
        		if(b[i]==a[j]) {
        			c[i]++;
        		}
        	}
        }

        int d = 0;

        for(int i=0; i<y; i++) {
        	if(c[i]!=0) {
        		d++;
        	}
        }

        System.out.println(d);

        sc.close();
    }
}
