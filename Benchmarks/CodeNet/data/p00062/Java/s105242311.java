import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] kekka=new int[10];
		int kotae=0;
		String watasi="";

		while(sc.hasNext()) {
			watasi=sc.next();
			for(int i=0; i<10; i++) {
				kekka[i]=Integer.parseInt(watasi.charAt(i)+"");
			}
			kotae=kekka[0]+kekka[1]*9+kekka[2]*6+kekka[3]*4+kekka[4]*6+kekka[5]*6+kekka[6]*4+kekka[7]*6+kekka[8]*9+kekka[9];
			kotae=kotae%10;
			System.out.println(kotae);
		}
	}
}
