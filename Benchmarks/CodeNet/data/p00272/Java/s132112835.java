import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t = 0;
		int n = 0;
		int y = 0;
		for(int i=1;i<=4;i++){
			 t = scan.nextInt();
			 n = scan.nextInt();
			 if(t == 1){
			 	y = n * 6000;
			 }else
			 if(t == 2){
			 	y = n * 4000;
			 }else
			 if(t == 3){
			 	y = n * 3000;
			 }else
			 if(t == 4){
			 	y = n * 2000;
			 }
			 System.out.println(y);
		}
	}
}