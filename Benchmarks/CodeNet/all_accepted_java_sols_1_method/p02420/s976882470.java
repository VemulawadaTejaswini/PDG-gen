import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String text = sc.next();
            if(text.equals("-")){
                break;
            }
            
            int m = sc.nextInt();
            
            for(int i = 0; i < m; i++){
                int h = sc.nextInt();
                String s1 = text.substring(0, h);
				String s2 = text.substring(h);
				text = s2 + s1;
            }
            System.out.println(text);
        }
    }
}
