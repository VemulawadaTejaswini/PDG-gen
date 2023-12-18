package memo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();

        int k=0;
        
        int x;
        
        int c;
        c=0;
        
        for(int i=0;i<N-1;i++) {
        	c=c+1;
        	for(int j=1;j<N-c+1;j++) {
        		x=(N-c)%j;
        		if(x==0) {
        			k=k+1;
        		}
        	}
        }
        
        // 出力
        System.out.println(k);
    }
}