import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		IntSummaryStatistics o=IntStream.range(0,s.nextInt()).map(i->s.nextInt()).summaryStatistics();
		System.out.println(o.getSum()>o.getMax()*2?"Yes":"No");
	}
}