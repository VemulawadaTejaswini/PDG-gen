import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int[] Num = new int[4];
		Scanner n=new Scanner(System.in);
		
		Num[0]=n.nextInt();
		Num[1]=n.nextInt();
		Num[2]=n.nextInt();
		
		for (int a = 1; a >= 0; a--){
			for (int b = 0; b <= 1; b++){
					if (Num[b] > Num[b+1]){
					Num[3]=Num[b];
					Num[b]=Num[b+1];
					Num[b+1]=Num[3];
					}//if終了
			}//内ループ終了
		}//外ループ終了
		System.out.println(Num[0]+" "+Num[1]+" "+Num[2]);
	}

}