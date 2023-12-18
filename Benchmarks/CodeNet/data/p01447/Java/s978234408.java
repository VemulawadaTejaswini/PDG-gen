import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new A().doIt();
    }
    class A{
        void doIt(){
        	long n = sc.nextLong();
        	long num = 3;
        	for(int i = 1;i < 21;i++){
        		if(n <= num){
        			System.out.println(i);
        			break;
        		}
        		num *= 3;
        	}
        }
    }
}