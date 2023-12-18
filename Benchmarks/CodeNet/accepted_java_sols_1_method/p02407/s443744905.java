import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b[]=new int[a];
int i=0;
do {
	b[i]=scan.nextInt();
	if(i==a-1)break;
	i++;
}while(true);
i=0;
int c=b.length-1;
do {
	System.out.print(b[c]);
	if(i==a-1)break;
	System.out.print(" ");
	i++;
	c--;
}while(true);
System.out.println();
}
}
