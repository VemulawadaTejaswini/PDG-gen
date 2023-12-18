import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String str;
    	String left;
    	String right;
    	String end = "-";
    	int shuffle;
    	int m;
    	
    	for(;;){
    		str = scan.next();
    		if(str.equals(end)) {
    			break;
    		}
    		m = scan.nextInt();
    		for(int i = 0; i < m; i++){
    			shuffle = scan.nextInt();
    			left = str.substring(0, shuffle);
    			right = str.substring(shuffle);
    			str = right + left;
    		}
    		System.out.println(str);
    	}
     }
}