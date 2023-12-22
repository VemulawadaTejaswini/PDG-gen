import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int[] yama=new int[10];
	void s(){
		for(int i=0; i<10; i++){
			yama[i]=sc.nextInt();
		}
		for(int i=0; i<9; i++){
			for(int j=i; j<10; j++){
				if(yama[i]<=yama[j]){
					int a =yama[j];
					yama[j]=yama[i];
	  			  	yama[i]=a;
				}
			}
		}
		for(int j=0; j<3; j++){
			System.out.println(yama[j]);
		}
	}
	public static void main(String[]agrs){
		new Main().s();
	}
}