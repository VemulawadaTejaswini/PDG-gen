import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int e = scan.nextInt();
			if(e==0){
				break;
			}
			int m=10000000;
			int x=0;
			for(int z=0;z<1000;z++){
				for(int y=0;y<1000;y++){
					x=e-(z*z*z)-(y*y);
					if(x<0){
						continue;
					}
					if(x+y+z<m){
						m=x+y+z;
					}

				}

			}

			System.out.println(m);
		}
	}
}