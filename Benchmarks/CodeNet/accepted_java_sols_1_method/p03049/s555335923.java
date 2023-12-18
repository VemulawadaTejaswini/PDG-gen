import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
    	try (Scanner sc = new Scanner(System.in)) {
    		/*
    		 * 頭文字にBを含むもの
    		 * 末尾にAを含むもの
    		 * 頭文字にB　&& 末尾にAを含むもの
    		 * 上記以外
    		 */
    		int lineSize = sc.nextInt();
    		int countAB = 0;
    		int countInialB = 0 ;
    		int countEndA = 0;
    		int countIniBEndA = 0;
    		
    		for (int lineNum = 1; lineNum <= lineSize; lineNum++) {
    			String readStr = sc.next();
    			if (readStr.contains("AB")) {
    				countAB += readStr.split("AB").length - 1;
    			}
    			if (readStr.startsWith("B")) {
    				if (readStr.endsWith("A")) {
    					countIniBEndA++;
    					
    				} else {
    					countInialB++;
    				}
    				
    			} else if (readStr.endsWith("A")) {
    				countEndA++;
    			}
    		}
    		if (countIniBEndA == 0) {
    			countAB += Math.min(countEndA, countInialB);
    		} else if (countEndA + countInialB == 0) {
    			
    			/*
    			 * BA * 3 
    			 *  BA,BA,BA
    			 *  
    			 */
    			countAB += countIniBEndA - 1;
    		} else {
    			/*
    			 * BA * 3, B * 1
    			 *  BA,BA,BA,B : 4
    			 * BA * 3, A * 1
    			 *  A,BA,BA,BA : 4
    			 * BA * 3, A * 1, B * 1
    			 *  A,BA,BA,BA,B : 4
    			 * BA * 3, A * 1, B * 2
    			 *  A,BA,BA,BA,B,(B) : 4
    			 *  BA,BA,BA,B,A,B  : 4
    			 *  
    			 */
    			countAB += (Math.min(countEndA, countInialB) + countIniBEndA);
    			
    			
    		}
    		System.out.println(countAB);
    	} catch (Exception e) {
			// TODO: handle exception
		}
    } 
}