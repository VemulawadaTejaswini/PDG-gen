import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Deque<Byte> train = new LinkedList<>();
		while (sc.hasNext()) {
			byte n;
			if((n = sc.nextByte()) != 0){
				train.push(n);
			}else{
				sb.append(train.poll());
				sb.append('\n');
			}
		}
		System.out.print(sb.toString());
	}
}

