import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new C().doIt();
    }
    class C{
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	ArrayList<Integer> array2 = new ArrayList<Integer>();
    	ArrayList<Integer> array3 = new ArrayList<Integer>();
        void doIt(){
        	int a[] = new int [1000001];
        	int b[] = new int [1000001];
        	int num = 1;
        	int cnt = 2;
        	while(num <= 1000000){
//        		System.out.println(num);
        		array.add(num);
        		num = num + cnt;
        		cnt += 1;
        	}
        	num = 1;cnt = 1;
        	while(num <= 1000000){
//        		System.out.println(num);
        		array2.add(num);
        		if(num % 2 == 1){
        			array3.add(num);
//        			System.out.println(num);
        		}
        		num = num + array.get(cnt);
        		cnt += 1;
        	}
//        	System.out.println(array2.size()+" "+array3.size());
        	Arrays.fill(a,100000);
        	a[0] = 0;
        	int length = array2.size();
        	for(int i = 0;i < 20000;i++){
        		for(int j = 0;j < length;j++){
        			int pos = array2.get(j);
        			if(i + pos > 1000000)break;
        			a[i+pos] = Math.min(a[i]+1,a[i+pos]);
        		}
        	}
        	Arrays.fill(b,100000);
        	b[0] = 0;
        	length = array3.size();
        	for(int i = 0;i < 100000;i++){
        		for(int j = 0;j < length;j++){
        			int pos = array3.get(j);
        			if(i + pos > 1000000)break;
        			b[i+pos] = Math.min(b[i]+1,b[i+pos]);
        		}
        	}
        	while(true){
        		int n = sc.nextInt();
        		if(n == 0)break;
        		System.out.println(a[n]+" "+b[n]);
        	}
        }
    }
}