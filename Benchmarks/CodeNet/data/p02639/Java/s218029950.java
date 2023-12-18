import java.util.*;

public class Main {
	public static int n[][] = {{1,1},{0,1},{-1,1},{1,0},{-1,0},{0,-1}};
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			for(int i=0;i<5;i++){
				if(scan.nextInt() == 0){
					System.out.println(i+1);
					break;
				}
			}
	}
}
