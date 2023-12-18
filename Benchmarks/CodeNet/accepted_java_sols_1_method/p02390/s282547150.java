import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int S=cin.nextInt(),time[]=new int[3];
		
		for(int i=0;i<3;i++){
			time[i]=S%60;
			S/=60;
		}
		
		System.out.println(time[2]+":"+time[1]+":"+time[0]);
	}

}

