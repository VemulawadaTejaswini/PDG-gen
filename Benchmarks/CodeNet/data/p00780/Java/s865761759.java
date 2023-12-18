import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new A().doIt();
    }
    class A{
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	void eratos(int MAX){ 
    		boolean [] isprime = new boolean[MAX + 1];
    		Arrays.fill(isprime, true);
    		isprime[0] = false;
    		isprime[1] = false;
    		for(int i = 0; i * i <= MAX; i++){
    			if(isprime[i]){
    				for(int j = i * 2; j <= MAX; j+= i){
    					isprime[j] = false;
    				}
    			}
    		}
    		for(int i = 0;i < MAX;i++){
    			if(isprime[i])array.add(i);
    		}
    	}
    	void doIt(){
    		int max = (int)Math.pow(2,15);
        	eratos(max);
        	int cnt[] = new int[max+1];
        	for(int i = 0;i < array.size();i++){
        		for(int j = i;j < array.size();j++){
        			int num = array.get(i) + array.get(j);
        			if(num <= max)cnt[num]++;
        		}
        	}
        	while(true){
        		int n = sc.nextInt();
        		if(n == 0)break;
        		System.out.println(cnt[n]);
        	}
        }
    }
}