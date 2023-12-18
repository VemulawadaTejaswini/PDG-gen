import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int s = sc.nextInt();
			String str = sc.next();
			String p = "I";
			for(int i = 0; i < n; i++){
				p += "OI";
			}
			int c = 0;
			for(int i = 0, m = s-2*n; i < m; i++){
				if(p.equals(str.substring(i, i+2*n+1))){
					c++;
i++;
				}
			}
			
			System.out.println(c);
		}
		
	}
	public static void main(String[] args){
		new Main();
	}
}