import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int t = scanner.nextInt();

            Takoyaki takoyaki = new Takoyaki();
            System.out.println(takoyaki.getTimeOfBake(n, x, t));
        }
    }
}


class Takoyaki {

	int getCountOfBake(int numOfCanBeBakedAtOneTime, int numOfWant) {
		if (numOfWant % numOfCanBeBakedAtOneTime > 0) {
			return (numOfWant / numOfCanBeBakedAtOneTime) + 1;
		}
		return numOfWant / numOfCanBeBakedAtOneTime;
	}

	public int getTimeOfBake(int n, int x, int bakeTimeUnit) {
		int bakeCount = this.getCountOfBake(x, n);
		return bakeTimeUnit * bakeCount;
	}
}