import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
        
        while (true) {
            int sol = 0;
            int n = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            
            if (n==0 && x==0)
                break;
            
            for (int i=1; i<=n-2; i++) {
                for (int j=i+1; j<=n-1; j++) {
                    for (int k=j+1; k<=n; k++) {
                        if (i+j+k == x) sol++;
                    }
                }
            }
            
            System.out.println(sol);
        }
	}
}