import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int x = 0;
			for(int i = 2; i <= n; i++){
				boolean is = true;
				for(int t = 2; t < i; t++){
					if(i % t == 0)
					is = false;
				}
				if(is)x++;
			}
			System.out.println(x);
		}
	}
}