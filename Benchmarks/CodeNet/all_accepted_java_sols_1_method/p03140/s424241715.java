import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
          
        int n = scan.nextInt();
        String st[] = new String[3];
        
        st[0] = scan.next();
        st[1] = scan.next();
        st[2] = scan.next();
        
        int cnt = 0;
        
        for(int i = 0 ; i < n ; i++){
          
          if(st[0].substring(i,i+1).charAt(0) == st[1].substring(i,i+1).charAt(0) &&
             st[1].substring(i,i+1).charAt(0) == st[2].substring(i,i+1).charAt(0) ){
          }
          else if(st[0].substring(i,i+1).charAt(0) == st[1].substring(i,i+1).charAt(0) ||
             st[1].substring(i,i+1).charAt(0) == st[2].substring(i,i+1).charAt(0) ||
             st[0].substring(i,i+1).charAt(0) == st[2].substring(i,i+1).charAt(0) ){
            cnt++;
          }
          else
            cnt += 2;
        }
            
        System.out.println(cnt);
	  }
}