import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			boolean[] a = new boolean[10000];
			for(int i = 0; i < 10000; i++){
				a[i] = false;
			}
			for(int i = 0; i < n; i++){
				int t = sc.nextInt();
				a[t] = true;
			}
			String[] str = new String[1000];
			int t = 0;
			for(int i = 0; i < 10000; i++){
				if(a[i]){
					int c = 0;
					String st = "";
					st += Integer.toString(i);
					i++;
					for(;i < 10000; i++){
						if(a[i]){
							c++;
						} else {
							break;
						}
					}
					if(c > 0){
						st += "-";
						st += Integer.toString(i-1);
					}
					str[t++] = st;
				}
			}
			
			System.out.print(str[0]);
			for(int i = 1; i < t; i++){
				System.out.print(" "+str[i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}