import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0)break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					switch(i%2){
					case 0:
						switch(j%2){
						case 0:
							System.out.print('.');
							break;
						case 1:
							System.out.print('#');
							break;
						}
					case 1:
						switch(j%2){
						case 0:
							System.out.print('#');
							break;
						case 1:
							System.out.print('.');
							break;
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}