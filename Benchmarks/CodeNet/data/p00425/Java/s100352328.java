import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = null;
		int orderNum;
		int sum = 1;

		int[] dDaice = {1,2,3,4,5,6};
		int[] north = {5,1,3,4,6,2};
		int[] east = {3,2,6,1,5,4};
		int[] west = {4,2,1,6,5,3};
		int[] south = {2,6,3,4,1,5};
		int[] Left = {1,3,5,2,4,6};
		int[] Right = {1,4,2,5,3,6};

		int[] bDaice = new int[6];
		int[] aDaice = new int[6];

		while((str = scan.nextLine()) != null){
			if(str.equals("0")){
				System.exit(0);
			}else{
				orderNum = Integer.parseInt(str);
				bDaice = dDaice;
				sum = bDaice[0];

				for(int i= 0; i < orderNum; i++){
					str = scan.nextLine();

					if(str.equals("North")){
						for(int j = 0; j < 6; j++){
							aDaice[north[j] - 1] = bDaice[j];
						}
					}else if(str.equals("East")){
						for(int j = 0; j < 6; j++){
							aDaice[east[j] - 1] = bDaice[j];
						}
					}else if(str.equals("West")){
						for(int j = 0; j < 6; j++){
							aDaice[west[j] - 1] = bDaice[j];
						}
					}else if(str.equals("South")){
						for(int j = 0; j < 6; j++){
							aDaice[south[j] - 1] = bDaice[j];
						}
					}else if(str.equals("Left")){
						for(int j = 0; j < 6; j++){
							aDaice[Left[j] - 1] = bDaice[j];
						}
					}else if(str.equals("Right")){
						for(int j = 0; j < 6; j++){
							aDaice[Right[j] - 1] = bDaice[j];
						}
					}else{
						System.out.println("Input Error");
					}
					bDaice = aDaice;
					sum += aDaice[0];
				}
				System.out.println(sum);
			}
		}
	}
}