import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		boolean color[]=new boolean[8];
		int z=0,a=0,y=0,min=0,max=400,tourist=0;
		while(z<N){
			a=stdIn.nextInt();
			while(y<9){
				if(y==8){
					tourist++;
					break;
				}
				if(min<=a&&a<max){
					color[y]=true;
					break;
				}
				min+=400;max+=400;
				y++;
			}y=0;
			z++;min=0;max=400;
		}z=0;y=0;min=0;max=0;
		while(z<8){
			if(color[z])
				min++;
			z++;
		}
		if(min==0&&tourist!=0)
			System.out.println(1+" "+tourist);
		else
			System.out.println(min+" "+(min+tourist));
	}
}