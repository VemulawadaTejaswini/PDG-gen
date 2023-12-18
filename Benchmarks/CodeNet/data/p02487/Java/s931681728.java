import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h,w;
		while(true){
			h=sc.nextInt();
			w=sc.nextInt();
			if(h==0&&w==0)break;
			for(int i=0;i<h;i++){
				if(i==0||i==h-1){
					for(int j=0;j<w;j++){
						System.out.print("#");
					}
				}
				else{
					System.out.print("#");
					for(int j=1;j<w-1;j++){
						System.out.print(".");
					}
					System.out.print("#");
				}
				System.out.print(System.getProperty("line.separator"));
			}
			System.out.print(System.getProperty("line.separator"));
		}
	}
}