import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int number = sc.nextInt();
			int count = 0;

			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					for(int k=0;k<10;k++){
						for(int l=0;l<10;l++){
							if(i+j+k+l == number) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}