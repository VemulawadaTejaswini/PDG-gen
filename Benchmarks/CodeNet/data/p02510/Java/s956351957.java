import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		String s = input.next();
    		if(s.equals("-"))break;
    		int snum = input.nextInt();
    		int[] scar = new int[snum];
    		for(int i = 0 ; i <scar.length ; i++){
    			scar[i] = input.nextInt();
    		}
    		for(int i = 0 ; i < scar.length ; i++){
    			s = s.substring(scar[i],s.length())+s.substring(0,scar[i]);
    		}
        	System.out.println(s);
    	}
    }
}