import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            String tempStr = String.valueOf(str.charAt(i));
            
            if(tempStr.equals("1")){
                count++;
            } 
        }
        
        System.out.println(count);
    }
}