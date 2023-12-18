import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			switch(biggestLength(a, b, c)){
			case 'a':
				if(isRightTriangle(a,b,c)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				break;
			case 'b':
				if(isRightTriangle(b, a, c)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				break;
			case 'c':
				if(isRightTriangle(c, a, b)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}

				break;
			}

		}

	}

	static char biggestLength(int a,int b,int c){
		if(a<=b){
			if(b<=c){
				return 'c';
			}else{
				return 'b';
			}
		}else if(a<=c){
			return 'c';
		}else{
			return 'a';
		}
	}

	static boolean isRightTriangle(int longest,int other1,int other2){
		int longestP=longest*longest;
		int other1P=other1*other1;
		int other2P=other2*other2;

		return longestP==other2P+other1P;

	}
}