import java.util.Random;
class integral {

	public static void main(String[] args) {
		Random stdIn = new Random();
		int[] a = {1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 25, 30, 40, 50, 60, 75, 100, 120, 150, 200, 300, 600};
		int n = stdIn.nextInt(a.length);
		int sum = 0;
		for(int i = 1;i < 600 / a[n];i++){
			sum += i*i*a[n]*a[n]*a[n];
		}
		System.out.println(n+" "+a[n]);
		System.out.println(sum);

	}

}