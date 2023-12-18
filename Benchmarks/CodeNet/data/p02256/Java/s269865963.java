import java.util.Random;
public class gcd {
	static int[] arySrchCd(int x, int y, int z){
		int count = 0;
		for(int i = 1;i < z;i++){
			if(x % i == 0 && y % i == 0)
				count++;
		}
		int[] a = new int[count];
		int t = 0;
		for(int i = 1;i < z;i++){
			if(x % i == 0 && y % i == 0){
				a[t] = i;
				t++;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Random stdIn = new Random();
		int x = stdIn.nextInt(1000000000) + 1;
		int y = stdIn.nextInt(1000000000) + 1;
		int z;
		if(x > y)
			z = y;
		else
			z = x;
		int[] a = arySrchCd(x,y,z);
		int gcd = a[0];
		for(int i = 0;i < a.length;i++){
			if(gcd < a[i])
				gcd = a[i];
		}
		System.out.println(gcd);
	}

}