import java.util.*;

class Main{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     int n = sc.nextInt();
     String s = sc.next();
     int cnt = 0;
      if(n%2 == 1){
      	System.out.println("No");
        return;
      }
     for(int i=0;i<n/2;i++){
     	if(s.charAt(i) == s.charAt(n/2 + i) ){
        	cnt++;
        }
     } 
      if(cnt == n/2){
      System.out.println("Yes");
      } else {
      System.out.println("No");
      }
	}
}