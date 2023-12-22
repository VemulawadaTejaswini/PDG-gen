public class Main {

	public static void main(String[] args) {
		String num=new java.util.Scanner(System.in).nextLine();
                int number=Integer.parseInt(num);
		int[] masu=new int[3];
		masu[0]=number/100;
		masu[1]=(number-masu[0]*100)/10;
		masu[2]=number-masu[0]*100-masu[1]*10;
		int count=0;
		for(int i:masu) {
			if(i==1) {
				count++;
			}
                }
		System.out.println(count);
	}

}