import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();

		int[] unit = new int[13];
		unit[1]=unit[3]=unit[5]=unit[7]=unit[8]=unit[10]=unit[12]=1;
		unit[4]=unit[6]=unit[9]=unit[11]=2;
		unit[2]=3;


		if(unit[x]==unit[y]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
