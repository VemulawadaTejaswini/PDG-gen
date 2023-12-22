import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		Deque<Integer> dq = new ArrayDeque<>();

		for(int i=0; i<str.length; i++){

			if(str[i].equals("+")){
				Integer num = dq.pop()+dq.pop();
				dq.push(num);

			}else if (str[i].equals("-")) {

				Integer num = dq.pop();
				dq.push(dq.pop()-num);

			}else if (str[i].equals("*")) {
				Integer num = dq.pop()*dq.pop();
				dq.push(num);
			}else {
				dq.push(Integer.parseInt(str[i]));

			}
		}
		System.out.println(dq.pop());
	}

}