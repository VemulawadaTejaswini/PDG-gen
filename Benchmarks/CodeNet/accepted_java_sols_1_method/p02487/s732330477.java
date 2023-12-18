import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		for(;;){
		int h=sc.nextInt();
		int w=sc.nextInt();
		if(h==0 && w==0){
			break;
		}
		for(i=0;i<w;i++){
			System.out.print('#');	
		}
		System.out.println("");
		for(i=0;i<h-2;i++){
			System.out.print('#');
			for(j=0;j<w-2;j++){
				System.out.print('.');
			}
			System.out.print('#');
			System.out.println("");
		}
		
		for(i=0;i<w;i++){
			System.out.print('#');
			}
		System.out.println("");
		System.out.println("");
		}
	}
}