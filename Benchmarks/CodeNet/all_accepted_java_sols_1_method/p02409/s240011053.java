import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main{


	public static void main(String[] args){

		Scanner scan=new Scanner(System.in);

		//SHDC?????????????????????????????????
		int[][] Bld1=new int[3][10];
		int[][] Bld2=new int[3][10];
		int[][] Bld3=new int[3][10];
		int[][] Bld4=new int[3][10];

		for(int i=0;i<3;i++){
			Arrays.fill(Bld1[i], 0);}
		for(int i=0;i<3;i++){
			Arrays.fill(Bld2[i], 0);}
		for(int i=0;i<3;i++){
			Arrays.fill(Bld3[i], 0);}
		for(int i=0;i<3;i++){
			Arrays.fill(Bld4[i], 0);}

		int Bld_num, floor,room,volume;

		try{
		int n=scan.nextInt();//n?????????

		for(int i=0;i<n;i++){
			Bld_num=scan.nextInt();
			floor=scan.nextInt();
			room=scan.nextInt();
			volume=scan.nextInt();



			switch(Bld_num){//???????????????????????????????????¨????????????1?????£??\???

			case 1:
				Bld1[floor-1][room-1]+=volume;
				break;
			case 2:
				Bld2[floor-1][room-1]+=volume;
				break;
			case 3:
				Bld3[floor-1][room-1]+=volume;
				break;
			case 4:
				Bld4[floor-1][room-1]+=volume;
				break;
			}
		}



		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+Bld1[i][j]);
			}System.out.println();
		}

		System.out.println("####################");

		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+Bld2[i][j]);
			}System.out.println();
		}

		System.out.println("####################");

		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+Bld3[i][j]);
			}System.out.println();
		}

		System.out.println("####################");

		for(int i=0;i<3;i++){
			for(int j=0;j<10;j++){
				System.out.print(" "+Bld4[i][j]);
			}System.out.println();
		}


		scan.close();

		}catch(InputMismatchException e){
			System.out.println("??¨??????"+e);
		}


	}

}