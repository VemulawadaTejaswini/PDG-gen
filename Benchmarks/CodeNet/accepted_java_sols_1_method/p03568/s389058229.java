import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ecnt=0;
		for(int i=0;i<n;i++){
			if(sc.nextInt()%2==0){
				ecnt++;
			}
		}
		System.out.println((int)Math.pow(3, n)-(int)Math.pow(2,ecnt));
	}

}