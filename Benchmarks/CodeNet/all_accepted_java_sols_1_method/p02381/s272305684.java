import java.io.*;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(s.hasNext()){
			Integer student_num = Integer.parseInt(s.next());
			if(student_num == 0){
				break;
			}

			ArrayList<Integer> score_list = new ArrayList<Integer>();
			for(int i = 0; i < student_num; i++){
				score_list.add(Integer.parseInt(s.next()));
			}
			Integer total = 0;
			for(int i = 0; i < student_num; i++){
				total += score_list.get(i);
			}
			double m = (double)total / student_num;
			double dev = 0;
			for(int i = 0; i < student_num; i++){
				dev += Math.pow(score_list.get(i) - m, 2);
			}
			double standard_dev = Math.sqrt(dev / student_num);
			System.out.println(String.format("%.8f", standard_dev));
		}

	}

}