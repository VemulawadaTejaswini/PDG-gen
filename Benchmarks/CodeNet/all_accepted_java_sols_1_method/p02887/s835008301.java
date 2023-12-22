import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        String S = stdin.next();
        String copy = S.substring(0,1);
        int cnt = 1;

        for(int i=1;i<S.length();i++) {
        	if(!(copy.equals(S.substring(i,i+1)))) {
        		copy =  S.substring(i,i+1);
        		cnt+=1;
        	}
        }
        System.out.println(cnt);
    }
}
