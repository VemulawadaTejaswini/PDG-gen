public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int[] a = {x};
		int i = 1;
		while(i != 0){
			for(int b : a){
				System.out.println("Case " + i +": " + x);
				i++;
			}
			break;
		}
	}

}