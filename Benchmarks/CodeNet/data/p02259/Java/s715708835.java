import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i = 0; i<N; i++)
			A.add(in.nextInt());
		
		int count = 0;
		boolean flag = true;
		while (flag)
		{
			flag = false;
			for (int j = N-1; j > 0; j--)
			{
				if (A.get(j) < A.get(j-1))
				{
					int temp = A.get(j);
					A.set(j, A.get(j-1));
					A.set(j-1, temp);
					flag = true;
					count++;
				}
			}
		}
		System.out.print(A.get(0));
		for(int a : A.subList(1, A.size()))
			System.out.print(" "+a);
		System.out.println("\n"+count);
	}
}

