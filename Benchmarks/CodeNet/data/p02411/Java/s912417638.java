import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    String INPUT = "";

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() {
        Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
        out.flush();
    }

    void solve(Scanner sc, PrintWriter out) {
        int m,f,r;
        
        for (;;) {
        	m = sc.nextInt();
        	f = sc.nextInt();
        	r = sc.nextInt();
        	if (m == -1 && f == -1 && r == -1) break;
        	
        	if (m == -1 || f == -1) {
				System.out.println("F");
			} else {
        		if (m+f >= 80) {
					System.out.println("A");
				} else {
        			if (m+f >= 65) {
						System.out.println("B");
					} else {
        				if (m+f >= 50) {
							System.out.println("C");
						} else {
        					if (m+f >= 30) {
        						if (r >= 50) {
									System.out.println("C");
								} else {
									System.out.println("D");
								}
							} else {
								System.out.println("F");
							}
						}
					}
				}
			}
		}
    }
}

