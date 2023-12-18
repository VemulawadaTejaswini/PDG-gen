import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b[][][]=new int[4][3][10];
int c[][]=new int[a][4];
for(int i=0;i!=a;i++) {
	c[i][0]=scan.nextInt();
	c[i][1]=scan.nextInt();
	c[i][2]=scan.nextInt();
	c[i][3]=scan.nextInt();
}
for(int i=0;i!=a;i++) {
	b[c[i][0]-1][c[i][1]-1][c[i][2]-1]=b[c[i][0]-1][c[i][1]-1][c[i][2]-1]+c[i][3];
}
for(int i=0;i!=4;i++) {
	for(int j=0;j!=3;j++) {
		for(int k=0;k!=10;k++) {
			System.out.print(" "+b[i][j][k]);
		}	
		System.out.println();
	}
	if(i!=3) {
	System.out.println("####################");
}
	}

}
}
