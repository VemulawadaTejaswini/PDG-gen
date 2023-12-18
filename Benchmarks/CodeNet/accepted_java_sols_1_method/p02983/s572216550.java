import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		sc.close();
		if(r - l >= 2018) {
			System.out.println(0);
			return;
		}
		long lMod = (l + 2019) % 2019;
		long rMod = (r + 2019) % 2019;
      if(rMod < lMod)
        rMod += 2019;
		long min = 100000;
		for(long i = lMod ; i <= rMod - 1 ; i++) {
			for(long j = i + 1 ; j <= rMod ; j++) {
				min = Math.min((i * j) % 2019 , min);
			}
		}
      System.out.println(min);

	}
}

