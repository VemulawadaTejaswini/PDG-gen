import java.util.Scanner;

public class Main{
public static void main(String[] args){
	int x,y,i,j;
	Scanner sc = new Scanner(System.in);
	while(true){
		x=sc.nextInt();
		y=sc.nextInt();
		if(x==0&&y==0){
			break;
		}
		for(i=0;i<x;i++){
			for(j=0;j<y;j++){
				System.out.printf("#");
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}

}
}