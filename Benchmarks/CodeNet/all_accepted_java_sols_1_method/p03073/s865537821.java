import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] tile = N.split("");
        
        String[] a = new String[tile.length];
        String[] b = new String[tile.length];
        
        int cnt1 = 0;
        int cnt2 = 0;
        

        for(int i = 0;i<tile.length;i++) {
        	if(i%2 == 0) {
        		if(tile[i].equals("1")) {
        			cnt1++;
        		}
        	}else {
        		if(tile[i].equals("0")) {
        			cnt1++;
        		}
        	}
        }
        
        for(int i = 0;i<tile.length;i++) {
        	if(i%2 == 0) {
        		if(tile[i].equals("0")) {
        			cnt2++;
        		}
        	}else {
        		if(tile[i].equals("1")) {
        			cnt2++;
        		}
        	}
        }
        System.out.println(Math.min(cnt1, cnt2));
       
    }
}