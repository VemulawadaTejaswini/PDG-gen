import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		try{
			while(true){
				new aoj0034().doIt();
			}
		}catch(Exception g){
			System.exit(0);
		}
	}
	class aoj0034{
		int a[] = new int [10];
		void doIt(){
			String str[] = sc.next().split(",");
			int sum = 0;
			for(int i = 0;i < 10;i++){
				a[i] = Integer.parseInt(str[i]);
				sum = sum + a[i];
			}
			int v1 = Integer.parseInt(str[10]);
			int v2 = Integer.parseInt(str[11]);
			double time = sum /(double)(v1 + v2); 
			time = time * v1;
			sum = 0;
			for(int i = 0;i < 10;i++){
				sum = sum + a[i];
				if(sum >= time){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}