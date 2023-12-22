import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean y=false;
		for(int i=0;i<3;i++){
			if(x/100==7){
				y=true;
				break;
			}else if((x%100)/10==7) {
				y=true;
				break;
			}else if(x%10==7) {
				y=true;
				break;
			}
		}
		if(y) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		

	}
}