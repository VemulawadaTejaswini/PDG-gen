import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new AOJ0266().doIt();
	}
	
	class AOJ0266{
		boolean[] input;
		int n;
		City[] citys;
		void doIt(){
			citys = new City[6];
			citys[0] = new City(1, 2);
			citys[1] = new City(-1, 3);
			citys[2] = new City(1, -1);
			citys[3] = new City(4, 5);
			citys[4] = new City(5, 2);
			citys[5] = new City(2, 1);
			while(true){
				String a = in.next();
				if(a.equals("#"))return;
				input = new boolean[a.length()];
				n = a.length();
				for(int i=0;i<n;i++)input[i] = a.charAt(i)=='1';
				int currentCity = 0;
				for(int i=0;i<n;i++){
					currentCity = citys[currentCity].nextIndex(input[i]);
					if(currentCity==-1)break;
				}
				System.out.println(currentCity==5? "Yes":"No");
			}
		}
		
		class City{
			int a,b;
			public City(int a,int b){//0,1
				this.a = a;
				this.b = b;
			}
			int nextIndex(boolean code){
				return code? b:a;
			}
		}
		
	}
	
}