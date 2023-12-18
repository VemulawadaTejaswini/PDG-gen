import java.util.Scanner;
class Main{
	static Scanner sc;
	static short top,north,east,south,west,bottom,tmp;
	static int freq,sum;
	static String str;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(true){
			top=1;bottom=6;
			south=2;north=5;
			east=3;west=4;
			sum=1;
			freq=sc.nextInt();
			if(freq==0)break;
			for(int i=0;i<freq;i++){
				str=sc.next();
				if(str.equals("North")){
					tmp=top;
					top=south;south=bottom;bottom=north;north=tmp;
					sum+=top;
				}else if(str.equals("East")){
					tmp=top;
					top=west;west=bottom;bottom=east;east=tmp;
					sum+=top;
				}else if(str.equals("West")){
					tmp=top;
					top=east;east=bottom;bottom=west;west=tmp;
					sum+=top;
				}else if(str.equals("South")){
					tmp=top;
					top=north;north=bottom;bottom=south;south=tmp;
					sum+=top;
				}else if(str.equals("Right")){
					tmp=north;
					north=west;west=south;south=east;east=tmp;
					sum+=top;
				}else if(str.equals("Left")){
					tmp=north;
					north=east;east=south;south=west;west=tmp;
					sum+=top;
				}
			}
			System.out.println(sum);
		}
	}
}