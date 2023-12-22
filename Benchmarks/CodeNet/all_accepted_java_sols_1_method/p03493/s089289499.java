import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("");
		int s1,s2,s3;
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();

		int count=0;
		if(s1 ==1 )
			count++;
		if(s2 ==1)
			count++;
		if(s3 == 1)
			count++;
		System.out.println(count);
		
	sc.close();
	}

}
