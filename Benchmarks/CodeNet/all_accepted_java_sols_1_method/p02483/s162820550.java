import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int x,y,z;
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();

		if(a>b){
			if(a>c){
				x=a;
				if(b>c){
					y=b;
					z=c;
					}
				else {
					y=c;
					z=b;
				}

			}
			else {
				x=c;
				y=a;
				z=b;
			}


		}
		else {
			if (b>c){
				x=b;
					if(a>c){
						y=a;
						z=c;
					}
					else{
						y=c;
						z=a;
					}
			}
			else {
				x=c;
				y=b;
				z=a;
			}
		}

		System.out.println(z + " " + y + " " + x);
	}
}