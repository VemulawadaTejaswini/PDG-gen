import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while(true){
		String input_line = input.readLine();

		String[] number = input_line.split(" ");

		// 1???until_num?????°
		int until_num = Integer.parseInt(number[0]);

		// 1???until_num??????????????°?????????????¶?????????°
		int num_sum = Integer.parseInt(number[1]);
		 if(until_num ==0&&num_sum==0){
	        	break;
	        }
		int count=0;
		for(int first_num=1; first_num<=until_num ; first_num++){
			for(int second_num=first_num+1; second_num<=until_num; second_num++){
				for(int third_num=second_num+1; third_num<=until_num; third_num++){
					int three_sum=first_num+second_num+third_num;
					if(three_sum==num_sum){
						count++;
					}
				}
			}

		}
		System.out.println(count);
        }

}

}