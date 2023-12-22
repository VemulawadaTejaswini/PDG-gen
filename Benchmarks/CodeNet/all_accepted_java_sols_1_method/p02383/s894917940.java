import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int [] a = new int[6];
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		a[3] = scan.nextInt();
		a[4] = scan.nextInt();
		a[5] = scan.nextInt();
		String moji = scan.next();
		int kai = moji.length();
		int i,taihi;
		for(i = 0;i < kai;i++){
			char b = moji.charAt(i);
			if(b == 'N'){
				taihi = a[0];
				a[0] = a[1];
				a[1] = a[5];
				a[5] = a[4];
				a[4] = taihi;
			}else if(b == 'W'){
				taihi = a[0];
				a[0] = a[2];
				a[2] = a[5];
				a[5] = a[3];
				a[3] = taihi;
			}else if(b == 'S'){
				taihi = a[0];
				a[0] = a[4];
				a[4] = a[5];
				a[5] = a[1];
				a[1] = taihi;
			}else if(b == 'E'){
				taihi = a[0];
				a[0] = a[3];
				a[3] = a[5];
				a[5] = a[2];
				a[2] = taihi;
			}
		}
		System.out.println(a[0]);
		scan.close();
	}
}

