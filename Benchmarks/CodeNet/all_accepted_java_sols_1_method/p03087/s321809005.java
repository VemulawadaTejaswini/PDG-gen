import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		int a[] = new int[n];
		int x = 0;
		boolean hantei = false;
		
		for(int i = 0; i < n; i++){
			char c = str.charAt(i);
			if(c == 'A'){
				a[i] = x;
				hantei = true;
			}else if(hantei && (c == 'C')){
				x += 1;
				a[i] = x;
				hantei = false;
			}else{
				a[i] = x;
				hantei = false;
			}
		}
		
		for(int i = 0; i < q; i++){
			int kekka = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();
			kekka = a[r-1] - a[l-1];
			System.out.println(kekka);
		}
	}
}