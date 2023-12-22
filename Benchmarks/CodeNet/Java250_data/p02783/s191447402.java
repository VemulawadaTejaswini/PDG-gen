import java.util.Scanner;

public class Main
{
	public static int main0(String[] args) {
		int servalDPS, monsterHealth;
		Scanner sc = new Scanner(System.in);
		monsterHealth = sc.nextInt();
		servalDPS = sc.nextInt();
		int remains = monsterHealth % servalDPS;
		if (remains == 0) return monsterHealth / servalDPS;
		else return monsterHealth / servalDPS + 1;
	}

	public static void main(String[] args) {
		int res = main0(args);
		System.out.print(res);
	}
}