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
				if(i%2==0){
					for(int j=0;j<w;j++){
						if(j%2==0)System.out.print("#");
						else System.out.print(".");
					}
				}
				else{
					for(int j=0;j<w;j++){
						if(j%2==0)System.out.print(".");
						else System.out.print("#");
					}
				}
				System.out.print(System.getProperty("line.separator"));
			}
			System.out.print(System.getProperty("line.separator"));
		}
	}
}