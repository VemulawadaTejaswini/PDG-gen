import java.util.Scanner;
class Main {
public void yatary(){
	Scanner sc = new Scanner(System.in);
	int x,y,n,z;
	x = sc.nextInt();
	y = x;
	z = 0;
	for(n = 3;n <= x; n++){
		if(x % 3 == 0){
			System.out.print(" " + x);
		}else{
			while(z == 0){
				if (x % 10 == 3){
					System.out.print(" " + x);
					z = z + 1;
				}
				y = y / 10;
				if(y < 3){
					z = z + 1;
			}
		}
		}
	}
	System.out.println();
	}
	public static void yatary(String[]args){
	}
}