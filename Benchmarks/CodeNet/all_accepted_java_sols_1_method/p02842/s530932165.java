import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		double n = sc.nextDouble();
		double answer = n/1.08;
		//System.out.println((int)answer);
		double check = (int)answer*1.08;
		//System.out.println(check);
		if(n==(int)check)
			System.out.println((int)answer);
		else {
			answer = (int)answer+1;
			check = (int)answer*1.08;
			if(n==(int)check)
				System.out.println((int)answer);
			else
				System.out.println(":(");
		}
	}
}