import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int ansh = 0;
        int ansm = 0;
        int ans = 0;
        if(m2 >= m1){
        	ansm = m2 - m1;
            ansh = h2 - h1;
        }else if(m2 < m1){
        	m2 += 60;
            h2 -= 1;
            ansm = m2 - m1;
            ansh = h2 - h1;
        }
        ans = (ansh * 60) + ansm;
        if((ans - k) <= 0){
        	System.out.println("0");
        }else{
        	System.out.println(ans - k);
        }
    }
}