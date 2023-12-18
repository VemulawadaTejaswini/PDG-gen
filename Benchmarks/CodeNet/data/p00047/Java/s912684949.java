import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] field = {1, 0, 0};
        String[] in;
        int rep1, rep2, tmp;
        while(sc.hasNext()) {
        	in = sc.next().split(",");
        	rep1 = setRep(in[0]);
        	rep2 = setRep(in[1]);
        	
        	tmp = field[rep1];
        	field[rep1] = field[rep2];
        	field[rep2] = tmp;
        }
        
        for(int i = 0; i < 3; i++) {
        	if(field[i] == 1)	System.out.println(setAlphabet(i));	
        }
    }
    
    static int setRep(String in) {
    	if(in.equals("A"))		return 0;
    	else if(in.equals("B"))	return 1;
    	else					return 2;
    }
    
    static String setAlphabet(int field) {
    	if(field == 0)		return "A";
    	else if(field == 1)	return "B";
    	else				return "C";
    }
}