import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		int uriage[] = new int[4];
		for(z=0;z<=3;z++){
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==1){
				x=6000;
			}else if(x==2){
				x=4000;
			}else if(x==3){
				x=3000;
			}else x=2000;
			
			uriage[z]=x*y;
			
			
		}
		for(z=0;z<=3;z++){
			System.out.println(uriage[z]);
		}
	
	
	}

}