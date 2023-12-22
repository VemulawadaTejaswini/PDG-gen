public class Main {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt()%10;
		int[] hon = {2,4,5,7,9};
		int[] pon = {0,1,6,8};
		int bon = 3;
		int times = hon.length+pon.length;
		for ( int i=0 ; i<times ; i++ ) {
			if ( num == hon[i]) {
				System.out.println("hon");
				break;
			} else if ( num == pon[i] ) {
				System.out.println("pon");
				break;
			} else if ( num == bon ) {
				System.out.println("bon");
				break;
			}
		}
	}

}
