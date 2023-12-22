import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		while (h!=0||w!=0){
			StringBuilder sb1=new StringBuilder("");
			for(int n=0;n<h;n++){
				for(int m=0;m<w;m++){sb1.append("#");}
				sb1.append("\n");
			}
			System.out.println(sb1);
			h=sc.nextInt();
			w=sc.nextInt();
		}
	}
}