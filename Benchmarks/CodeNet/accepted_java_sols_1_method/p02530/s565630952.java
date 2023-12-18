import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int[] a = new int[2];
			int n = scan.nextInt();
			for(int i = 0 ; i < n; i ++){
				int judge = scan.next().compareTo(scan.next());
				if(judge < 0){
					a[1]+=3;
				}else if ( judge > 0){
					a[0]+=3;
				}else
					for(int j = 0 ; j < 2; j++)a[j]++;
			}
			System.out.printf("%d %d\n",a[0],a[1]);
		}finally{
			scan.close();
		}
	}
}