import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int s = sc.nextInt();
				System.out.print(s/3600+ ":");
				s=s%3600;
				System.out.println(s/60+":"+s%60);
			}
		}

