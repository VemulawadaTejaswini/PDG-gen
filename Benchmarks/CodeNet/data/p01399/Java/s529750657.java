import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int limit = scan.nextInt();
			if(n == 0 && limit == 0){
				break;
			}
			int[] a = new int[n];
			int min = 0;
			int b = 0;
			boolean sw = false;
			int t;
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
				t = a[i] * (limit / a[i]);
				if(i == 0 || min > t){
					min = t;
					b = i;
					sw = false;
				}else if(min == t){
					if(a[b] > a[i]){
						b = i;
					}else if(a[b] == a[i]){
						sw = true;
					}
				}
			}
			System.out.println((sw)?n:b+1);
		}
	}
}