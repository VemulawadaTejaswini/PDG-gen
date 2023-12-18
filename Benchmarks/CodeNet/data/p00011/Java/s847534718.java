import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int tmp, n, w, com;
	static String str[];
	static int a[] = new int[30], b[] = new int[30], line[] = new int[30];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		w = sc.nextInt();
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			str = sc.next().split(",");
			
			a[i] = Integer.parseInt(str[0]);
			b[i] = Integer.parseInt(str[1]);
		}
		
		return true;
	}
	
	public static void solve(){
		
		for(int i = 0; i < w; i++){
			line[i] = i + 1;
		}
		
		for(int i = 0; i < n; i++){
			tmp = line[a[i]-1];
			line[a[i]-1] = line[b[i]-1];
			line[b[i]-1] = tmp;
		}
		
		for(int i = 0; i < w; i++){
			System.out.println(line[i]);
		}
	}

}