import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H[] = new int[N];
        int cnt = 0;
        for(int i=0; i<N; i++) {
        	H[i] = sc.nextInt();
        	if(i==0) {
        		cnt++;
        	}else {
        		for(int j=0; j<i; j++) {
        			if(H[i]<H[j]) {
        				break;
        			}if(j==i-1) {
        				cnt++;
        			}
        		}
        	}
        }
        sc.close();
        System.out.println(cnt);      
    }
}