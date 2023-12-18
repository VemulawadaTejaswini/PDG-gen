import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a[]=new int[3000];
int b[]=new int[3000];
int x=0;
int y=0;
int i=0;
int count=0;
int count2=0;
int count3=0;
int count4=0;
do {
	x=scan.nextInt();
	y=scan.nextInt();
	a[i]=x;
	b[i]=y;
	i++;
}while(!(x==0&&y==0));
i=0;
do {
		if(a[count2]==0) {break;}
		do {
			if(a[count2]==count) {break;}
				do{
					if(b[i]==count4) {break;}
						do {if(b[i]==count3) {break;}
							System.out.print("#");
								count3++;
						}while(true);
					count3=0;
					System.out.println();
					count4++;
					}while(true);
				count4=0;
				i++;
				System.out.println("\n");
				count++;
			}while(true);
		count=0;
		count2++;
	}while(true);
}
}
