import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
		int h=sc.nextInt();
		int w=sc.nextInt();
		if(h==0&&w==0||h,w<1||h,w>300){
			break;
		}
		int i,j;
		for(i=0;i<h;i++){
			for(j=0;j<w;j++){
				System.out.print('#');
			}
			System.out.println("");
		}
		}
	}
}