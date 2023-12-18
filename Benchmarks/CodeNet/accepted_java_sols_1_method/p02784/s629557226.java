import java.util.Scanner;
 
public class Main {
    static int scoreR;
    static int scoreS;
    static int scoreP;
	public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int h = scn.nextInt();
            int n = scn.nextInt();
            scn.nextLine();
            for(int i=0; i<n; i++){
                h = h-scn.nextInt();
            }
            String ret = h > 0 ? "No":"Yes";
            System.out.println(ret);
        }
	}
	
}
