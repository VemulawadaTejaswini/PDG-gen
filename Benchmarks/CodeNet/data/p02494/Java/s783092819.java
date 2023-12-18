import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int w=sc.nextInt();
			int h=sc.nextInt();
			if(w==0&&h==0)break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print('#');
				}
				System.out.print('\n');
			}
			System.out.print('\n');
		}
	}
}