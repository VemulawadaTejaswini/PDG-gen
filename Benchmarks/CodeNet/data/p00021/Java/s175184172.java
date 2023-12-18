import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] lon = new float[8];
		int n = sc.nextInt();
		
		while(n<100){
			for(int i = 0; i < n; i++){
				for(int j =0; j < lon.length; j++){
					lon[j] = sc.nextFloat();
				}
				if(lon[1]-lon[0] == lon[3] - lon[2]){
					if(lon[5]-lon[4] == lon[7]-lon[6]){
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
				}else{
					System.out.println("No");
				}
			}
		}
	}
}