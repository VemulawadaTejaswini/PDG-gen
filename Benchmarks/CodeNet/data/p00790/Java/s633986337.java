import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new aoj1210().doIt();
    }
    class aoj1210{
    	int dice[] = {1,5,4,3,2,6};
    	void turn(char c) {
			switch(c){
			case 'n': swap(0,4,5,1); break;
			case 's': swap(0,1,5,4); break;
			case 'w': swap(0,3,5,2); break;
			case 'e': swap(0,2,5,3); break;
			}
		}
		void swap(int i, int j, int k, int l) {
			int temp = dice[l];
			dice[l] = dice[k];
			dice[k] = dice[j];
			dice[j] = dice[i];
			dice[i] = temp;
		}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			for(int i = 0;i < 6;i++){
    				if(i == 0 || i == 5)dice[i] = i+1;
    				else dice[i] = 6-i;
    			}
    			if(n == 0)break;
    			for(int i = 0;i < n;i++){
    				String str = sc.next();
    				turn(str.charAt(0));
    			}
    			System.out.println(dice[0]);
    		}
    	}
    }
}