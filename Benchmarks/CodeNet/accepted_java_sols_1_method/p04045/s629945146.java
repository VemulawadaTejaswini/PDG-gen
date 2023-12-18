import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String[] a = new String[k];
		for(int i = 0; i < k; i++){
			a[i]=sc.next();
		}
		for(int i = n; i<10*n;i++){
			String b=Integer.toString(i);
			boolean contain=true;
			for(String m:a){
				if(b.contains(m)){
					contain=false;
					break;
				}
			}
			if(contain==true){
				System.out.println(b);
				return;
			}
		}
	}
}