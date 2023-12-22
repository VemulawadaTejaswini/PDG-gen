





import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();

		long[][] keisu={
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1},
				{0,0,0,0,0,0,0,0,11,2},
				{0,0,0,0,0,0,0,112,22,4},
				{0,0,0,0,0,0,1124,224,44,8},
				{0,0,0,0,0,11248,2248,448,88,16},
				{0,0,0,0,112496,22496,4496,896,176,32},
				{0,0,0,1124992,224992,44992,8992,1792,352,64},
				{0,0,11249984,2249984,449984,89984,17984,3584,704,128},
				{0,112499968,22499968,4499968,899968,179968,35968,7168,1408,256},
				{1124999936,224999936,44999936,8999936,1799936,359936,71936,14336,2816,512}
		};

		int keta=a.length();
		long src=Long.parseLong(a);
		long[] suuji=new long[10];

		for(int i=0; i<10; i++) {
			suuji[9-i]=src%10;
			src/=10;
		}

		long res=0;

		for(int i=0; i<10; i++) {
			res+=suuji[i]*keisu[keta][i];
		}
		System.out.println(res);
	}
}