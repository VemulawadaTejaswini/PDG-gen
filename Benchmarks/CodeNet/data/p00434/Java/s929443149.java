import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		//出席者の出席番号を、昇順に取得
		Scanner stdIn = new Scanner(System.in);
		int[] attendanceNumbers = new int[30];
		for(int i=0;i<28;i++){
			attendanceNumbers[i] = stdIn.nextInt();
		}
		attendanceNumbers[28] = 31;
		attendanceNumbers[29] = 31;
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
			if(_1to30>=31)break;
		}
	}
}