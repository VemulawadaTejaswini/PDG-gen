import java.util.Scanner;

class Main{

	Main(){
		Scanner scan = new Scanner(System.in);	
		int yen =1000-scan.nextInt();
		System.out.println(hantei(yen));
	
	}

	int[] init(int[] w){
		for(int i=0;i<w.length;i++){
			w[i]=0;
		}	
		return w;
	}

	int hantei(int yen){
		int coin=0;

		if((yen/500)>0){
			int a=yen/500;
			for(int i=0;i<a;i++){
				coin++;	
			}
			yen=yen%500;
		}
		if((yen/100)>0){
		int a=yen/100;
			for(int i=0;i<a;i++){
				coin++;	
			}
			yen=yen%100;
		}
		if((yen/50)>0){
			int a=yen/50;

			for(int i=0;i<a;i++){
				coin++;	
			}
			yen=yen%50;
		}
		if((yen/10)>0){
				int a=yen/10;

			for(int i=0;i<a;i++){
				coin++;	
			}
			yen=yen%10;
		}
		if((yen/5)>0){
			int a=yen/5;

			for(int i=0;i<a;i++){
				coin++;	
			}
			yen=yen%5;
		}
		for(int i=0;i<yen;i++){
			coin++;
		}

		return coin;
	}

	public static void main(String[] args){
		Main a = new Main();
	}


}