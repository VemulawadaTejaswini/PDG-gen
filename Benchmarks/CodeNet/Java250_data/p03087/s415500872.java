import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        ArrayList<Integer> List = new ArrayList<Integer>();
        int num=0;
        for(int i=0;i<N-1;i++) {
            char s = S.charAt(i);
            char s2 = S.charAt(i+1);
            if(s=='A'&&s2=='C'){
                List.add(num);
                num+=1;
            }
            else List.add(num);
        }
        List.add(num);
        for(int i=0;i<Q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int opt =List.get(r-1)-List.get(l-1);
            System.out.println(opt);
        }
	}
}
