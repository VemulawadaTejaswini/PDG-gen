import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int Dig = 1;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int kei = a+b;
			while(kei/10 != 0){
				Dig ++;
				kei /= 10;
			}
			System.out.println(Dig);
		}
	}
}