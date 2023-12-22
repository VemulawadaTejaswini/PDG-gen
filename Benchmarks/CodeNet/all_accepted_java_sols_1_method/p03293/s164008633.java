import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String t = sc.next();
      	String log[] = s.split("");
        String tmt;
        String ans;
        int i;
        int count = 1;
		if(s.equals(t)){
           System.out.println("Yes");
           System.exit(0);
        }
      	
        while(count != s.length()){
            tmt = log[s.length() - 1];
     		for(i = s.length() - 2; i >= 0; i --){
          		log[i + 1] = log[i];         
        	}
          	log[0] = tmt;
          
          	StringBuilder sb = new StringBuilder();
            for(i=0;i <s.length(); i++){
              sb.append(log[i]);
              }
            ans = sb.toString();
            if(ans.equals(t)){
              System.out.println("Yes");
              System.exit(0);
            }
            count += 1;
        }
              System.out.println("No");        
    }
}