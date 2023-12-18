import java.util.*;

class Solution{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int  j= 1;j <= t;j++){
     	int a = sc.nextInt();
    	int x = sc.nextInt();
    	int b = sc.nextInt();
    	int y = sc.nextInt();
    	int c = sc.nextInt();
    	Stack<Integer> sta = new Stack<>();
    	Stack<Integer> stb = new Stack<>();
    	for(int i = 0;i < x;i++){
      		sta.push(a);
    	}
    	for(int i = 0;i < y;i++){
      		stb.push(b);
    	}
    	int rem = 0,count = 0;
    	while(!sta.isEmpty() && !stb.isEmpty()){
      		rem = (rem+sta.pop())%c;
      		if(rem == 0) count++;
      		else {
        		if( (rem + stb.peek())%c < rem) {
        			rem = (rem + stb.pop())%c;
        			if(rem == 0)  count++;
        		}
      		}
    	}
    	while(!sta.isEmpty()) {
    		rem = (rem + sta.pop())%c;
    		if(rem == 0) count++;
    	}
    	while(!stb.isEmpty()) {
    		rem = (rem + stb.pop())%c;
    		if(rem == 0) count++;
    	}
    	System.out.println(count);
    }
  }
}
