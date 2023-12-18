import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int e = scan.nextInt();
			if(e==0){
				break;
			}
			int m=10000;
			for(int x=0;x<1000;x++){
				for(int y=0;y<1000;y++){
					for(int z=0;z<100;z++){
						if(x+(y*y)+(z*z*z)==e){
							if(x+y+z<m){
								m=x+y+z;
							}
						}
					}
				}
			}
			System.out.println(m);
		}
	}

}