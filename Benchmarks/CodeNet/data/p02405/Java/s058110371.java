import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		while (h!=0||w!=0){
			StringBuilder sb1=new StringBuilder("");
			StringBuilder sb2=new StringBuilder("");
			for(int m=1;m<w;m+=2)sb1.append("#.");
			for(int m=1;m<w;m+=2)sb2.append(".#");
			if(w%2==1){sb1.append("#");sb2.append(".");
			}
			for(int n=1;n<h;n+=2){
				System.out.println(sb1);
				System.out.println(sb2);
			}
			if(h%2==1)System.out.println(sb1);
			System.out.println("");
			h=sc.nextInt();
			w=sc.nextInt();
		}
	}
}