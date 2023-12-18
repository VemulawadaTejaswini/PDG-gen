import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] p=new int[6];
		p[0]=sc.nextInt();
		p[1]=sc.nextInt();
		p[2]=sc.nextInt();
		p[3]=sc.nextInt();
		p[4]=sc.nextInt();
		p[5]=sc.nextInt();
		sc.close();
		for(int i=0;i<p.length-1;i++){
			for(int j=i+1;j<p.length-1;j++){
				if(Math.abs(p[i]-p[j])>p[5]){
					System.out.println(":(");
					System.exit(0);
				}
			}
		}
		System.out.println("Yay!");
	}
}