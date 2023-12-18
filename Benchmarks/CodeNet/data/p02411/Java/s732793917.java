import java.util.Scanner;

//20180509
//03

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();

			int m_f = m + f;

			if(m + f + r == -3)
				break;
			if(m == -1 || f== -1)
				System.out.println("F");
			if(m_f >= 80)
				System.out.println("A");
			if(m_f >= 65 && m_f < 80)
				System.out.println("B");
			if(m_f >= 50 && m_f < 65)
				System.out.println("C");
			if(m_f >= 30 && m_f < 50) {
				System.out.println("D");
				if(r >= 50)
					System.out.println("C");
			}
			if(m_f < 30)
				System.out.println("F");
		}
		scanner.close();
    }
}
