import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj2508().doIt();
	}
	class aoj2508{
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int a[] = new int [n];
				for(int i = 0;i < n;i++){
					a[i] = sc.nextInt();
				}
				String str = sc.next();
				char ctr[] = str.toCharArray();
				for(int i = 0;i < ctr.length;i++){
					if(ctr[i] >= 'a' && ctr[i] - a[i % n] < 'a'){
						ctr[i] = (char) (ctr[i] - a[i % n] - 6);
					}else if(ctr[i] >= 'A' && ctr[i] - a[i % n] < 'A'){
						ctr[i] = (char) (ctr[i] - a[i % n] + 58);
					}else{
						ctr[i] = (char) (ctr[i] - a[i % n]);
					}
					System.out.print(ctr[i]);
				}
				System.out.println();
			}
		}
	}
}