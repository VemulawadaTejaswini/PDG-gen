import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m,f,r;
		int x[][] = new int[51][3];
		int i = 0;
		while(true){
			m = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			if ((m==-1)&&(f==-1)&&(r==-1)) {
				break;
			} else {
				x[i][0] = m;
				x[i][1] = f;
				x[i][2] = r;
				i++;
			}
		}
		stdIn.close();
		for(int j=0;j<i; j++) {
			//中間試験、期末試験のいずれかを欠席した場合成績は F。
			if(x[j][0]==-1 ||x[j][1]==-1) {
				System.out.println("F");
			//中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
			} else if((x[j][0] + x[j][1]) >=80) {
				System.out.println("A");
			//中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
			} else if((x[j][0] + x[j][1]) >=65) {
				System.out.println("B");
			//中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
			} else if((x[j][0] + x[j][1]) >=50) {
				System.out.println("C");
			//中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
			} else if((x[j][2]) >=50) {
				System.out.println("C");
			} else if((x[j][0] + x[j][1]) >=30) {
				System.out.println("D");
			} else {
			//中間試験と期末試験の合計点数が 30 未満ならば成績は F。
				System.out.println("F");
			}
		}
	}
}

