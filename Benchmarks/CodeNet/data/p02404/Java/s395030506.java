import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void aa(){
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0)break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(i==0||i==h-1||j==0||j==w-1)System.out.print("#");
					else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}