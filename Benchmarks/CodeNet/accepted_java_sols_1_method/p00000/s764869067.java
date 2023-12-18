public class Main {
	public static void main(String[] a){
        int i=1, j=1, m=1;
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				m = i*j;
				System.out.println(i + "x" + j + "=" + m);
			}
		}
    }
}