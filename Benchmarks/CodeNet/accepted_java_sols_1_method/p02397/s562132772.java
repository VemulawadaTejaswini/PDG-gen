import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
		int x[]=new int[6000],y[]=new int[6000];
		x[0]=kb.nextInt();
		y[0]=kb.nextInt();
		int h=0;
		int i=0;
		while(x[h]!=0||y[h]!=0){
			h++;
			x[h]=kb.nextInt();
			y[h]=kb.nextInt();

		}

		while(x[i]!=0||y[i]!=0){
			if(x[i]>=y[i]){
				System.out.printf("%d %d",y[i],x[i]);
			}else if(x[i]<y[i]){
				System.out.printf("%d %d",x[i],y[i]);
			}
			System.out.println();
			i++;
		}
	}

}