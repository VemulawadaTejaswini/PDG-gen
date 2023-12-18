import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ati[]=new int[sc.nextInt()];
		int max=-10000000,min=10000000;
		long sum=0;
		for(int i=0;i<ati.length;i++) {
			ati[i]=sc.nextInt();
			if(ati[i]>max) {
				max=ati[i];
			}
			if(ati[i]<min) {
				min=ati[i];
			}
			sum+=ati[i];
		}
			System.out.println(min+" "+max+" "+sum);
			sc.close();
	}
}

