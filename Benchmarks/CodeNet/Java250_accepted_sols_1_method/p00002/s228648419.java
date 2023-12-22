import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int f_num,s_num;
		while(sc.hasNextInt()){
			f_num = sc.nextInt();
			s_num =sc.nextInt();
			System.out.println(String.valueOf(f_num + s_num).length());
		}
		sc.close();
	}
}