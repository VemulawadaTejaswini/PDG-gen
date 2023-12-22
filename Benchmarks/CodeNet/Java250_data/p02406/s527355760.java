import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	int n = sc.nextInt();
        	for(int i = 1;i <= n;i++){
        		if(i % 3 == 0)System.out.print(" "+i);
        		else {
        			int x = i;
                    while(x!=0){
                        if(x % 10 == 3){
                        	if(x % 10 == 3)System.out.print(" "+i);
                            break;
                        }
                        x /= 10;
                    }
        		}
        	}
        	System.out.println();
        }
    }
}