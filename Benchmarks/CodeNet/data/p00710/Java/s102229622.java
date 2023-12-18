import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1129().doIt();
	}
	class aoj1129{
		void doIt(){
			while(true){
				ArrayList<Integer> array = new ArrayList<Integer>();
				int n = sc.nextInt();
				int r = sc.nextInt();
				if(n + r == 0)break;
				for(int i = 1;i < n+1;i++){
					array.add(i);
				}
				for(int i = 0;i < r;i++){
					int p = sc.nextInt();
					int c = sc.nextInt();
					for(int j = p + c - 1;j >= p;j--){
						array.add(array.remove(n-(p+c-1)));
					}
				}
				System.out.println(array.get(n-1));
			}
		}
	}
}