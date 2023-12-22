import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		Interval inter1 = new Interval(A, B);
		Interval inter2 = new Interval(C, D);

		Interval sect = Interval.GetIntersection(inter1, inter2);
		if(sect == null){
			sect = new Interval(0,0);
		}
		int ans = sect.GetLength();

		System.out.println(ans);
	}
}


class Interval{
	int Start;
	int End;

	Interval(int s, int e){
		Start = s;
		End = e;
	}

	static Interval GetIntersection(Interval i1, Interval i2){
		if(i1.Start > i2.Start){
			return GetIntersection(i2, i1);
		}
		if(i1.End < i2.Start){
			return null;
		}
		return new Interval(i2.Start, Math.min(i1.End, i2.End));

	}

	int GetLength(){
		return End - Start;
	}
}
