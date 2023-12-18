import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count=0;
		Scanner sanner=new Scanner(System.in);
		while(true){
			String[] s=sanner.nextLine().split(" ");
			int[] a=new int[s.length];
			for(int i=0;i<s.length;i++){
				a[i]=Integer.parseInt(s[i]);
			}
			if(a[0]==a[1]&&a[0]==0){
				break;
			}
			System.out.println(Math.min(a[0], a[1])+" "+Math.max(a[0], a[1]));
		}
	}
}