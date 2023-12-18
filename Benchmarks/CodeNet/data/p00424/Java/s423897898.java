import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] exchange = new String[N][2];
        for	(int i = 0 ; i < N ; i++) {
        	exchange[i][0] = sc.next();
        	exchange[i][1] = sc.next();        	
        }
        
        int M = sc.nextInt();
        int flag = 0;
        String str;
        for (int i = 0 ; i < M ; i++) {
        	flag = 0;
        	str = sc.next();
        	for (int j = 0 ; j < N ; j++) {
        		if (str.equals(exchange[j][0])) {
        			System.out.println(exchange[j][1]);
        			flag = 1;
        			break;
        		}
        	}
        	if (flag == 0) {
        		System.out.println(str);
        	}
        }
    }
}