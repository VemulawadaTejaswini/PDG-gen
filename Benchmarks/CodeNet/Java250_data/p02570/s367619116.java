import java.util.Scanner;

public class Main{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int T = scan.nextInt();
        int S = scan.nextInt();
        float t = (float)D / (float)S;

        System.out.println(
            t <= (float)T ? "Yes" : "No"
        );
    }
}