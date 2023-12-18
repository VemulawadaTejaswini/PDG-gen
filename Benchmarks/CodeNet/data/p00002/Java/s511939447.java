import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		int Dig = 1;
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			int kei = a+b;
			while(kei/10 != 0){
				Dig ++;
				kei /= 10;
			}
		}
		System.out.println(Dig);
	}
}