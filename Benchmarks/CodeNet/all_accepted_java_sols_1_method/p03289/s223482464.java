import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
		
		if(s.charAt(0)!='A'){
		    System.out.println("WA");
		    return;
		}
		
		int ccount=0;
		int cnum=0;
		for(int i=2; i<s.length()-1; i++){
		    if(s.charAt(i)=='C'){
		        ccount++;
		        cnum=i;
		    }
		}
		
		if(ccount!=1){
		    System.out.println("WA");
		    return;
		}
		
		for(int i=1; i<s.length(); i++){
		    if(i!=cnum){
		        if(Character.isUpperCase(s.charAt(i))){
		            System.out.println("WA");
		            return;
		        }
		    }
		}
		
		System.out.println("AC");
		return;
    }
}
