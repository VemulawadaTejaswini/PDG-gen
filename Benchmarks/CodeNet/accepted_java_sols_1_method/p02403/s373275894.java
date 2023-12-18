import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder("");
		int H=sc.nextInt(),W=sc.nextInt(),x;
		while (H!=0 || W!=0){
			x=0;
			for (int m=1;m<=W;m++){
				x++;
				sb.append("#");}
		for (int n=1;n<=H;n++){System.out.println(sb);}
			System.out.println();
			sb.delete(0,x);
			H=sc.nextInt();W=sc.nextInt();
				}}}