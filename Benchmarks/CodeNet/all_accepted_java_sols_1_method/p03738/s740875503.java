import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
		String ans ="";
		
		if(a.length()>b.length()){
		    System.out.println("GREATER");
		    return;
		}else if(a.length()<b.length()){
		    System.out.println("LESS");
		    return;
		}else{
		    for(int i=0; i<a.length(); i++){
		        int an = Character.getNumericValue(a.charAt(i));
		        int bn = Character.getNumericValue(b.charAt(i));
		        if(an>bn){
		            System.out.println("GREATER");
		            return;
		        }else if(an<bn){
		            System.out.println("LESS");
		            return;
		        }
		    }
		}

		
		System.out.println("EQUAL");
    }
}
