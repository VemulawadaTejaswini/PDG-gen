import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(bf.readLine());
	StringBuilder sb = new StringBuilder();
	Deque<Integer> d = new ArrayDeque<Integer>();

	for(int i = 0;i < n;i++) {
		String str = bf.readLine();

		if(str.charAt(0) == 'i') {
			d.push(Integer.parseInt(str.substring(7)));
		}else if(str.charAt(6) == 'L') {
			d.removeLast();
		}else if(str.charAt(6) == 'F') {
			d.removeFirst();
		}else {
			d.remove(Integer.parseInt(str.substring(7)));
		}
	}
    sb.append(d.poll());
    for (Integer num : d) {
        sb.append(" ").append(num);
    }
    System.out.println(sb.toString());
}
}

