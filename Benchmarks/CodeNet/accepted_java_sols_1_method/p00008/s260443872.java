import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext()){
		int f=0;
		int n=scan.nextInt();
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					for(int l=0;l<10;l++){
						if(i+j+k+l==n){
							f++;
						}
					}
				}
			}
		}
		System.out.println(f);
		}
	}

}