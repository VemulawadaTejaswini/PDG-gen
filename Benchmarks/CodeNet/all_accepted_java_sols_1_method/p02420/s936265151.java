import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	String s = sc.next();
            if(s.equals("-"))
                break;
        	int m = sc.nextInt();
            int h = 0;
            for(int i = 0; i < m; i++)
        	h += sc.nextInt();
            for(int i = 0; i < s.length(); i++)
                System.out.print(s.charAt((h+i) % s.length()));
                System.out.println();
            h = 0;
        }
    }
}
