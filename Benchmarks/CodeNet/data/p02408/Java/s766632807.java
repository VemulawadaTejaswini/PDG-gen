import java.util.Scanner;
public class Main {


//参照する山札


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = 0;
	int a = sc.nextInt();//行
	int Scard[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	int Hcard[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	int Ccard[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	int Dcard[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
while(d<a){
	String m = sc.next();//マーク
	int b = sc.nextInt();//数字

	//行分
			if(m.equals("S")){
				Scard[b-1]=0;
			}

			if(m.equals("H")){
				Hcard[b-1]=0;
			}

			if(m.equals("C")){
				Ccard[b-1]=0;
			}

			if(m.equals("D")){
				Dcard[b-1]=0;
			}

		d++;
	}

		for(int k =0;k<d;k++){
		if(Scard[k]!=0)
			System.out.println("S "+Scard[k]);
		if(Hcard[k]!=0)
			System.out.println("H "+Hcard[k]);
		if(Ccard[k]!=0)
			System.out.println("C "+Ccard[k]);
		if(Dcard[k]!=0)
			System.out.println("D "+Dcard[k]);
		}

	}

}

