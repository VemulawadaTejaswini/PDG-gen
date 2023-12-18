import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder soto=new StringBuilder("");
		StringBuilder naka=new StringBuilder("");
		int H=sc.nextInt(),W=sc.nextInt(),x;
	while(H!=0||W!=0){
		x=0;
		for(int n=1;n<=W;n++){
			x++;
			soto.append("#");}
		naka.append("#");
		for(int n=1;n<=W-2;n++){
			naka.append(".");}
		naka.append("#");
		System.out.println(soto);
		for(int n=1;n<=H-2;n++){
			System.out.println(naka);}
		System.out.println(soto);
		System.out.println();
		soto.delete(0,x);naka.delete(0,x);
		H=sc.nextInt();W=sc.nextInt();
			}
	}}