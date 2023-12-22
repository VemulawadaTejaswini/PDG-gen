	import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,nom1=0,nom2=0,nom3=0;
		for (int n=1;n<=3;n++){
			no=sc.nextInt();
			if (nom1<no){
				nom3=nom2;nom2=nom1;nom1=no;
			}else if (nom2<no){
				nom3=nom2;nom2=no;
			}else if (nom3<no){
				nom3=no;
			}	
		}
		System.out.println(nom3 +" "+ nom2 +" "+ nom1);
			}
}