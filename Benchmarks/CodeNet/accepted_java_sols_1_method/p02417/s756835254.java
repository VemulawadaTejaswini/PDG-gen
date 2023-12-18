import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[] count = new int[26];
        Arrays.fill(count, 0);
        char[] tgts = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        while(sc.hasNextLine()) {
	        String str = sc.nextLine();
	        char[] strArray = str.toCharArray();
	        for(i = 0; i < strArray.length; i++){
	        	strArray[i] = Character.toLowerCase(strArray[i]);
	        	for(j = 0; j < tgts.length; j++){
	            	if(strArray[i] == tgts[j]) {
	            		count[j]+= 1;
	            		break;
	            	}
	            }
	        }
        }
        
        for(j = 0; j < tgts.length; j++) {
        	System.out.print(tgts[j] + " : " + count[j]);
        	if(j != tgts.length) {
        		System.out.println();
        	}
        }
        sc.close();
    }
}

