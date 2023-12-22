import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		while(true){
			int h=s.nextInt(),w=s.nextInt();
			if(h==0&&w==0)
				break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}