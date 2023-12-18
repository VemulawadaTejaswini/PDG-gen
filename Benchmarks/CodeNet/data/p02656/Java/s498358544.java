import java.util.*;

class Solution{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 1;i <= t;i++){
     	int a = sc.nextInt();
    	int x = sc.nextInt();
    	int b = sc.nextInt();
    	int y = sc.nextInt();
    	int c = sc.nextInt();
    	Stack<Integer> sta = new Stack<>();
    	Stack<Integer> stb = new Stack<>();
    	for(int i = 0;i < a;i++){
      		sta.push(x);
    	}
    	for(int i = 0;i < b;i++){
      		stb.push(y);
    	}
    	int rem = -1,count = 0;
    	while(!sta.isEmpty() && !stb.isEmpty()){
      		rem = (rem+sta.pop())%c;
      		if(rem == 0) count++;
      		else {
        		if( (rem + stb.peek())%c < rem)
        			rem = (rem + stb.pop())%c;
      		}
    	}
    System.out.println(count);
    }
  }
}
