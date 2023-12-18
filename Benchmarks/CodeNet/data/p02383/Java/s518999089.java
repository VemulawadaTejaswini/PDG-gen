public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int[] x = new int[6];

		for(int i = 0; i < 6; i++){
			x[i] = scan.nextInt();
		}
		String str = scan.nextLine();

		for(int i = 0; i < 6; i++){
			int a = 0;
			if("E".equals(str)){
				a = x[0];
				x[0] = x[3];
				x[3] = x[5];
				x[5] = x[2];
				x[2] = a;
			}else if("W".equals(str)){
				a = x[0];
				x[0] = x[2];
				x[2] = x[5];
				x[5] = x[3];
				x[3] = a;
			}else if("N".equals(str)){
				a = x[0];
				x[0] = x[1];
				x[1] = x[5];
				x[5] = x[4];
				x[4] = a;
			}else if("S".equals(str)){
				a = x[0];
				x[0] = x[4];
				x[4] = x[5];
				x[5] = x[1];
				x[1] = a;
			}
		}
		System.out.println(x[0]);
	}

}