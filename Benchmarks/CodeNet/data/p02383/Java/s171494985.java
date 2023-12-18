import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		// ?????¢?????°??????????????????
		int l1 = scan.nextInt();
		int l2 = scan.nextInt();
		int l3 = scan.nextInt();
		int l4 = scan.nextInt();
		int l5 = scan.nextInt();
		int l6 = scan.nextInt();
		// ?????????????????????
		String s = scan.next();
		int l = s.length();
		for(int i = 0; i<l; i++){
			String meirei = s.substring(i, i+1);
			int lx =0;
			if(meirei.equals("S")){
				lx = l1;
				l1 = l5;
				l5 = l6;
				l6 = l2;
				l2 = lx;
			}
			else if(meirei.equals("N")){
				lx = l1;
				l1 = l2;
				l2 = l6;
				l6 = l5;
				l5 = lx;
			}
			else if(meirei.equals("E")){
				lx = l1;
				l1 = l3;
				l3 = l6;
				l6 = l4;
				l4 = lx;
			}
			else if(meirei.equals("W")){
				lx = l1;
				l1 = l4;
				l4 = l6;
				l6 = l3;
				l3 = lx;
			}
		}
		System.out.println(l1);
		
		
	}

}