import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b < a)
			System.out.println(a-1);
		else
			System.out.println(a);
			*/
		//B
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 0 ; i < k ; i++){
			int max = a;
			int max_index = 0;
			if(max < b){
				max = b;
				max_index = 1;
			}
			if(max < c){
				max = c;
				max_index = 2;
			}
			switch(max_index){
				case 0: a*=2;break;
				case 1: b*=2;break;
				case 2: c*=2;break;
			}
		}
		System.out.println(a+b+c);
		//C
		/*
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0 ; i < h ; i++){
			s[i] = sc.next();
		}
		boolean successflag = true;
		for(int i = 0 ; i < h ; i++){
			for(int j =0 ; j < w ; j++){
				boolean flag = false;
				if (s[i].charAt(j) == '#') {
					if (i > 0) {//上
						if (s[i - 1].charAt(j) == '#')
							flag = true;
					}
					if (i < h - 1) {//下
						if (s[i + 1].charAt(j) == '#')
							flag = true;
					}
					if (j > 0) {
						if (s[i].charAt(j - 1) == '#')
							flag = true;
					}
					if (j < w - 1) {
						if (s[i].charAt(j + 1) == '#')
							flag = true;
					}
					if (!flag)
						successflag = false;
				}
			}
		}
		if(successflag)
			System.out.println("Yes");
		else
			System.out.println("No");
			*/
	}
}
