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
		void cnt(int num,int a[]){
			if(num < 10)a[0]++;
			else if(num < 20)a[1]++;
			else if(num < 30)a[2]++;
			else if(num < 40)a[3]++;
			else if(num < 50)a[4]++;
			else if(num < 60)a[5]++;
			else a[6]++;
		}
		void doIt(){
			while(true){
				int n = Integer.parseInt(sc.next());
				if(n == 0)break;
				int a[] = new int [7];
				for(int i = 0;i < n;i++){
					int num = Integer.parseInt(sc.next());
					cnt(num,a);
				}
				for(int i = 0;i < 7;i++)System.out.println(a[i]);
			}
		}
	}
}