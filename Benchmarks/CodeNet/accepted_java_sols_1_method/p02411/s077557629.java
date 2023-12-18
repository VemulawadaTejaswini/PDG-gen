import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		//テストの成績を格納するリストを宣言
		List<String> grades = new ArrayList<String>();

		while(true){
			//各テストの変数を宣言と値を入力
			int point_middle = scan.nextInt();
			int point_end_term = scan.nextInt();
			int reTest = scan.nextInt();
			//中間と期末の合計点
			int point_total = point_middle + point_end_term;

			if(point_middle == -1 && point_end_term == -1 &&reTest == -1){
				break;
			}

			if(point_middle == -1 || point_end_term == -1){
				grades.add("F");
			}else if(80 <= point_total){
				grades.add("A");
			}else if(65 <= point_total && point_total < 80 ){
				grades.add("B");
			}else if(50 <= point_total && point_total < 65 || 50<=reTest){
				grades.add("C");
			}else if(30 <= point_total && point_total < 50){
				grades.add("D");
			}else if(point_total < 30){
				grades.add("F");
			}
		}

		//拡張for文でリストの成績を出力
		for(String grade : grades){
			System.out.println(grade);
		}
		scan.close();
	}
}

