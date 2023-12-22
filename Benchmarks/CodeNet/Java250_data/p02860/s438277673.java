import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Nstr = sc.nextLine();
        String S = sc.nextLine();

        int N = Integer.parseInt(Nstr);
        String a = "";
        String b = "";

        for( int i = 0; i < N; i++ ) {
        	if( i < N / 2 ) {
        		a += S.substring(i,i+1);
        	}else {
        		b += S.substring(i,i+1);
        	}
        }
        if(a.equals(b)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}