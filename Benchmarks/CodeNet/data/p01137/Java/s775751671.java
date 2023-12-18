import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	int a[] = new int [1000001];
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	ArrayList<Integer> array2 = new ArrayList<Integer>();
        void doIt(){
        	for(int i = 1;i <= 100;i++){
        		int num = i*i*i;
        		array2.add(i*i*i);
        		a[num] = i;
        	}
        	for(int i = 1;i <= 1000;i++){
        		int num = i*i;
        		array.add(i*i);
        		if(a[num] == 0 || a[num] < i){
        			a[num] = i;
        		}
        	}
        	for(int i = 0;i < 1000;i++){
        		for(int j = 0;j < 100;j++){
        			int num = array.get(i) + array2.get(j);
        			if(num > 1000000)break;
        			else if(a[num] == 0 || a[num] > i+j+2){
        				a[num] = i+j+2;
        			}
        		}
        	}
        	for(int i = 1;i <= 1000000;i++){
        		if(a[i] == 0)a[i] = a[i-1]+1;
        		else if(a[i] > a[i-1])a[i] = a[i-1] + 1;
        	}
        	while(true){
        		int n = sc.nextInt();
        		if(n == 0)break;
        		System.out.println(a[n]);
        	}
        }
    }
}