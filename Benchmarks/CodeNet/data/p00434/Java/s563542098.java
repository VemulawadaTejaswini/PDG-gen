import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		//出席者の出席番号を、昇順に取得
		Scanner stdIn = new Scanner(System.in);
		int[] attendanceNumbers = new int[28];
		for(int i=0;i<28;i++){
			attendanceNumbers[i] = stdIn.nextInt();
		}
		Arrays.sort(attendanceNumbers);
		int _1to30=1;
		for(int i:attendanceNumbers){
			if(i!=_1to30){
				System.out.println(_1to30);
				_1to30++;
				if(i!=_1to30){
					System.out.println(_1to30);
					_1to30++;
				}
			}
			_1to30++;
		}

	}
}