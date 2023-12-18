import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[6];
		for(int i=0;i<3;i++){
			for(int j=0;j<6;j++){
				a[j]=stdIn.nextInt();
			}
			int h=0,m=0,s=0;
			h=a[3]-a[0];
			m=a[4]-a[1];
			s=a[5]-a[2];
			if(s<0){
				m--;
				s+=60;
			}
			if(m<0){
				h--;
				m+=60;
			}
			System.out.println(h+" "+m+" "+s);
		}
	}
}