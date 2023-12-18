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
        	int a[] = {10,50,100,500};
        	int num[] = new int [4];
        	boolean first = true;
        	while(true){
        		int n = sc.nextInt();
        		if(n == 0)break;
        		if(!first)System.out.println();
        		int ans[] = new int [4];
        		for(int i = 0;i < 4;i++)num[i] = sc.nextInt();
        		n = num[0]*10 + num[1]*50+num[2]*100+num[3]*500 - n;
//        		System.out.println(n);
        		for(int i = 3;i >= 0;i--){
        			ans[i] = n / a[i];
        			n -= ans[i] * a[i];
        		}
        		for(int i = 0;i < 4;i++){
        			if(num[i] - ans[i] > 0)System.out.println(a[i]+" "+(num[i] - ans[i]));
        		}
        		first = false;
        	}
        }
    }
}