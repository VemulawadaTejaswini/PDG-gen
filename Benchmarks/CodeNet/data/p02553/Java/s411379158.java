public class Main{
public static void main(String[] args){

		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		long c = Long.parseLong(args[2]);
		long d = Long.parseLong(args[3]);

		long answer=0;

		if(Math.multiplyExact(a, c) > answer) {
			answer = Math.multiplyExact(a, c);
		}
		if(Math.multiplyExact(a, d) > answer) {
			answer = Math.multiplyExact(a, d);
		}

		if(Math.multiplyExact(b, c) > answer) {
			answer = Math.multiplyExact(a, c);
		}
		if(Math.multiplyExact(b, d) > answer) {
			answer = Math.multiplyExact(a, d);
		}
		System.out.print(answer);
	}
}