import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aw = a + width;
		int bw = b + width;
		if((a<=b&&b<=aw)||(b<=a&&a<=bw)){
			System.out.println(0);
		}else if(bw<a){
			System.out.println(a-bw);
		}else if(b>aw){
			System.out.println(b-aw);
		}
	}
}