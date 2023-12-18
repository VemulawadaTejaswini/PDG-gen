import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n+1; i++) {
        	String s = String.valueOf(i);
        	if (i%3 == 0) {
        		System.out.print(" " + i);
        	} else if(s.contains("3")) {
        		System.out.print(" " + i);
        	}
        }
        System.out.println();
    }
}
