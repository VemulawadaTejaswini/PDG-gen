import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while(true){
			int x = a.nextInt();
			int y = a.nextInt();
			if(x > y){
				System.out.println(y+" "+x);
			}else{
				System.out.println(x+" "+y);
			}
		}
	}
}