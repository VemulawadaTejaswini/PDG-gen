import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int MOUNTAIN[]=new int[10];
	for(int i=0;i<10;i++){
		MOUNTAIN[i]=sc.nextInt();
	}
	for(int i=1;i<10;i++){
		for(int j=0;j<10-i;j++){
			if(MOUNTAIN[j]>MOUNTAIN[j+1]){
				int taihi;
				taihi = MOUNTAIN[j];
				MOUNTAIN[j]=MOUNTAIN[j+1];
				MOUNTAIN[j+1]=taihi;
			}
			
		}
	}
	for(int i=9;i!=6;i--){
		System.out.println(MOUNTAIN[i]);
	}
		}
	}