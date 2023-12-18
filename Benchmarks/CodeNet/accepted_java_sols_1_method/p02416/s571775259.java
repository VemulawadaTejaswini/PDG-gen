import java.util.Scanner;
 
class Main {
    	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
        	while(true){
            		String str = sc.next();
             		if(str.charAt(0) == '0'){
                		break;
            		}
	            	int ans = 0;
            		for(int i = 0; i < str.length(); i++){
                		ans += (int)str.charAt(i)-48;
            		}
            		System.out.println(ans);
        	}
    	}
}