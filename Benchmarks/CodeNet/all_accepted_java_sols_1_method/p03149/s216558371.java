import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		if(a==1||b==1||c==1||d==1) {
			count1=1;
		}
		if(a==9||b==9||c==9||d==9) {
			count2=1;
		}
		if(a==7||b==7||c==7||d==7) {
			count3=1;
		}
		if(a==4||b==4||c==4||d==4) {
			count4=1;
		}
		if(count1==1&&count2==1&&count3==1&&count4==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
}
	}