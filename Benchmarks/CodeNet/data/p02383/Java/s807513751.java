import java.util.*;

class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int[] a = new int[6];
		for(int i = 0; i < 6; i++) a[i] = s.nextInt();
		
		String mozi = s.next();
		int k = mozi.length();
		int i, tmp;
		for(i = 0; i < k; i++){
			char z = mozi.charAt(i);
			if(z == 'N'){
				tmp = a[0];
				a[0] = a[1];
				a[1] = a[5];
				a[5] = a[4];
				a[4] = tmp;
			}else if(z == 'S'){
				tmp = a[0];
				a[0] = a[4];
				a[4] = a[5];
				a[5] = a[1];
				a[1] = tmp;
			}else if(z == 'E'){
				tmp = a[0];
				a[0] = a[3];
				a[3] = a[5];
				a[5] = a[2];
				a[2] = tmp;
			}else if(z == 'W'){
				tmp = a[0];
				a[0] = a[2];
				a[2] = a[5];
				a[5] = a[3];
				a[3] = tmp;
			} //if
		} //for
		System.out.println(a[0]);
	} //main
} //class
