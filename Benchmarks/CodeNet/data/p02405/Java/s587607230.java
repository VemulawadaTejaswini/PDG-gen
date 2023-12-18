import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		while (h!=0||w!=0){
			if (h%2==1) h=h/2+1;else h=h/2;
			if (h%2==1) w=w/2+1;else w=w/2;
			StringBuilder sb1=new StringBuilder("");
			StringBuilder sb2=new StringBuilder("");
			for(int m=0;m<w;m++)sb1.append("#.");
			for(int m=0;m<w;m++)sb2.append(".#");
			for(int n=0;n<h;n++){
				System.out.println(sb1);
				System.out.println(sb2);
			}
			System.out.println("");
			h=sc.nextInt();
			w=sc.nextInt();
		}
	}
}