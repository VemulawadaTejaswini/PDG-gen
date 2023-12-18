import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int b = sc.nextInt();
			if(b == 0){
				//System.out.println("break");
				break;
			}
			int[] a = new int[b];
			int left,right,searchvalue;
			for(int i=0; i < a.length; i++){
				a[i] = sc.nextInt();
			}
			searchvalue = sc.nextInt();
			left = 0; right = a.length-1;
			solve(left, right, searchvalue, a, 0);
		}
	}

	void solve(int left, int right,int sv,int[] a, int cnt){
		if(left > right){//left < 0 || right < 0 || left > right
			System.out.println(++cnt);
		}
		if(a[(left + right) / 2] < sv){
			if(left != right || !(left > right)){
				left = (left + right) / 2 + 1;
				solve(left, right,sv, a, ++cnt);
			}else{
				System.out.println(++cnt);
			}
		}else if(a[(left + right) / 2] > sv){
			if(left != right || !(left > right)){
				right = (left + right) / 2 - 1;
				solve(left, right,sv, a, ++cnt);
			}else{
				System.out.println(++cnt);
			}
		}else{
			System.out.println(++cnt);
		}
	}
}