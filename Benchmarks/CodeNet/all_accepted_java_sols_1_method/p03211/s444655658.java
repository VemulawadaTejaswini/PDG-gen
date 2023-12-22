import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      
		String[] slist = s.split("");
        int[] list = new int[s.length()];
        for(int tmp = 0; tmp < slist.length ; tmp++){
            list[tmp] = Integer.parseInt(slist[tmp]);
        }
        
        int result = 0;
        for(int tmp1 = 0; tmp1 < list.length - 2 ; tmp1++) {
        	int a = list[tmp1]*100 + list[tmp1+1]*10 + list[tmp1+2];
        	int absdiff = Math.abs(753 - a);
        	if(tmp1 == 0) {
        		result = absdiff;
        	} else {
        		result = result <= absdiff ? result : absdiff;
        	}
        }
        System.out.println(result);
	}
}