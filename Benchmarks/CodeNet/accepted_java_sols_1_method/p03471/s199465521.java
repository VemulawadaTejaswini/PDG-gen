import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
        int man = 0;
        int go = 0;
        int sen = 0;
        boolean hantei = false;
        if((double)y/10000 > n) {
            man = -1;
            go = -1;
            sen = -1;
        }else {
            for(int i=(y/10000)+1;i>=0;i--){
                if(hantei) {
                    break;
                }
                if(10000*i+1000*(n-i) > y) {
                    continue;
                }
                for(int j=n-i; j>=0; j--) {
                    int k = n-i-j;
                    long sum = 10000*i+5000*j+1000*k;
                    //System.out.println(i+" "+j+" "+k+" "+sum);
                    if(10000*i+5000*j+1000*k == y) {
                        man = i;
                        go = j;
                        sen = k;
                        hantei = true;
                        break;
                    }
                }
            }
        }
        if(hantei) System.out.println(man+" "+go+" "+sen);
        else System.out.println(-1+" "+-1+" "+-1);
	}
}