import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int[] a = new int[10];
			for(int j=0;j<10;j++){
				a[j] = sc.nextInt();
			}
			int b=0;
			int c=0;
			boolean clear = true;
			for(int j=0;j<10;j++){
				int x = a[j];
				if(j==0){
					b=x;
				}else if(x < b && x < c){
					clear = false;
				}else if(x > b && x < c){
					b=x;
				}else if(x < b && x > c){
					c=x;
				}else{
					if(x-b>x-c){
						c=x;
					}else if(x-c>x-b){
						b=x;
					}
				}
			}
			if(clear==true){
				System.out.println("YES");
			}else if(clear==false){
				System.out.println("NO");
			}
		}
	
	}
}