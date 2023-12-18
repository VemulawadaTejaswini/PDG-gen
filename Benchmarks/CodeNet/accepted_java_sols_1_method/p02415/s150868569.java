import java.util.Scanner;
class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String s = scan.nextLine();
    	char[] ca = s.toCharArray();
    	
    	String change;
    	
    	for(int i = 0; i < ca.length; i++){
    		if(Character.isLowerCase(ca[i])){
    			ca[i] = Character.toUpperCase(ca[i]);
    		}else{
    			ca[i] = Character.toLowerCase(ca[i]);
    		}
    	}
    	change = String.valueOf(ca);
    	
    	System.out.println(change);
     }
}