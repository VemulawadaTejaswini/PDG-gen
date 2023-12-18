import java.util.Scanner;
class Main{
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a, b, c, n;
		n = in.nextInt();
		for(int i=0; i<n*3; i++){
			a=in.nextInt();
			b=in.nextInt();
			c=in.nextInt();
			if(a+b>c){
				if(b+c>a){
					if(c+a>b){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
    }
}