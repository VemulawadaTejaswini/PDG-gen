import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int arry[]=new int[3];
		for (int i=0;i<3 ;i++ ) {
			arry[i]=input.nextInt();
		}
		int rank[]=new int[3];
		int tmp;
	for(int j=0;j<3;j++){
		if (arry[0] >= arry[1]) {
			tmp=arry[0];
			arry[0]=arry[1];
			arry[1]=tmp;
		}
		if (arry[1] >= arry[2]) {
					tmp=arry[1];
					arry[1]=arry[2];
					arry[2]=tmp;
		}
	}
	for (int k=0;k<3;k++) {
		rank[k]=arry[k];
	}
		System.out.printf("%d %d %d%n",rank[0],rank[1],rank[2]);
	}
}