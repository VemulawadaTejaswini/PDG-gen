import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
        	int count = 0;
            for(int x = i; x < s.length(); x++){
                if(s.charAt(x) == 'A' || s.charAt(x) == 'C' || s.charAt(x) == 'G' || s.charAt(x) == 'T'){
                	count++;
                }else{
                	break;
                }
            }
            if(max < count){
            	max = count;
            }
        }
        System.out.println(max);
    }
}