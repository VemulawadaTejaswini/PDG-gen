import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int aaa[] =new int[5];
		for(int i=0;i<5;i++){
			aaa[i]=scn.nextInt();
		}
		int k=scn.nextInt();
		if(aaa[1]-aaa[0]<=k&&aaa[2]-aaa[0]<=k&&aaa[3]-aaa[0]<=k&&aaa[4]-aaa[0]<=k&&aaa[2]-aaa[1]<=k&&aaa[3]-aaa[1]<=k&&aaa[4]-aaa[1]<=k&&aaa[3]-aaa[2]<=k&&aaa[4]-aaa[2]<=k&&aaa[4]-aaa[3]<=k){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}

}
