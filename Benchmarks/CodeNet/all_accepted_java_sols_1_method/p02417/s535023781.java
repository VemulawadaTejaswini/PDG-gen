import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[26];
        while(sc.hasNext()) {
        	String str = sc.nextLine();
            
            for(int i1 = 0; i1 < str.length(); i1++) {
            	char c = str.charAt(i1);
            	for(int i2 = 0; i2 < 26; i2++) {
            		if((int)c == (int)'a'+i2 || (int)c == (int)'A'+i2) {
            			count[i2]++;
            		}
            	}
            }
            
            
        }
        
        for(int i2 = 0; i2 < 26; i2++) {
        	System.out.println((char)('a'+i2) + " : " + count[i2]);
        }
    }
}
