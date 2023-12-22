import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a<b){
					int s = a;
					a = b;
					b = s;
			}
			if(a<c){
					int s = a;
					a = c;
					c = s;
			}

			if((a*a)==((b*b)+(c*c))){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}