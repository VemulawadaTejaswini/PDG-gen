import java.util.*;
import java.util.regex.*;
public class Main {


        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            
            Pattern p =Pattern.compile("4|6");
            while(true ){
            	int next=0;
            	int n = scan.nextInt();
            	if(n==0)break;
            	 for(int i=0;i<n;i++){
            		 Matcher m = p.matcher(Integer.toString(next));
                 	do{
                 		
                 		next++;
                 		m = p.matcher(Integer.toString(next));
                 	}
                 	while(m.find());
                 	
                 }
            	 System.out.println(next);

        }
            
        }
}