import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        char tiles[] = S.toCharArray();
        int cnt = 0;
        if(tiles.length==1) {
        	System.out.println(0); 
        }
        else {
        	for(int i=1; i<tiles.length; i++) {
        		if(tiles[i-1]!=tiles[i]) {
        			//何もしない
        		}else {
        			cnt++;
        			if(tiles[i] == '0') {
        				tiles[i] = '1';
        			}else {
        				tiles[i] = '0';
        			}
        		}
        	}
        	System.out.println(cnt); 
        }           
    }
}