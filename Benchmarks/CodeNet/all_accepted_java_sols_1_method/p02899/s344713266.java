import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer>attendanceNumber=new HashMap<>();
		
		//クラスの人数
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			//iが登校順、scが出席番号
			attendanceNumber.put(sc.nextInt(),i);
		}
	
		for(int i=1;i<=N;i++) {
			if(attendanceNumber.containsKey(i)) {
				System.out.print(attendanceNumber.get(i)+" ");
			}
		}
	}
}
