import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int X = scan.nextInt();

	int min = Integer.MAX_VALUE;
	int sum = 0;
	int[] m_ = new int[N];
	for(int i = 0; i < N; i++){
	    m_[i] = scan.nextInt();
	    if(m_[i] < min){
		min = m_[i];
	    }
	    sum += m_[i];
	}

	X -= sum;

	int count = N + (X/min);

	System.out.println(count);
    }
}
