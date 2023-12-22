import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[m];
        String s[] = new String[m];
        for(int i = 0; i < m; i++){
        	p[i] = sc.nextInt();
            s[i] = sc.next();
        }
        boolean ac[] = new boolean[n];
        int wa[] = new int[n];
        int ac_count = 0;
        int wa_count = 0;
        for(int i = 0; i < m; i++){
            int count = 0;
            if(ac[p[i] - 1]){
            	continue;
            }
            if(s[i].equals("WA")){
            	wa[p[i] - 1]++;
            }else{
            	ac_count++;
                wa_count += wa[p[i] - 1];
                ac[p[i] - 1] = true;
            }
        }
        System.out.println(ac_count + " " + wa_count);
    }
} 