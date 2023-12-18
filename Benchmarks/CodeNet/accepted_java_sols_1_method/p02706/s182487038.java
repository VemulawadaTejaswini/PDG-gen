import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vacation = Integer.parseInt(sc.next());
		int homeworkNum = Integer.parseInt(sc.next());
		for(int i=0;i<homeworkNum;i++) {
			int days = Integer.parseInt(sc.next());
			vacation-=days;
		}
		if(vacation<0) {
			System.out.println(-1);
		}else {
			System.out.println(vacation);
		}
	}

}
