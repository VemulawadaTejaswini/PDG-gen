import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int taro=0;
		int hanako=0;
		String first = "";
		String second = "";
		for(int i=0;i<n;i++){
			first = scan.next();
			second = scan.next();
			if((first.compareTo(second))>0)
				taro+=3;
			else if((first.compareTo(second))<0)
				hanako+=3;
			else{
				taro++;
				hanako++;
			}
		}
		System.out.println(taro+" "+hanako);
	}
}