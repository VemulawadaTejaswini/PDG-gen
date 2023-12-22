import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int h=0;h < 241;h++){
			if(n >= 3600){
				n = n-3600;
			}else{
				System.out.print(h+":");
				break;
			}
		}
		for(int m=0;m < 60;m++){
			if(n >=60){
				n = n-60;
			}else{
				System.out.println(m+":"+n);
				break;
			}
		}
	}
}