import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int w=sc.nextInt();
			int n=sc.nextInt();
			int value[]=new int[w];
			for(int i=0;i<value.length;i++) {
				value[i]=i+1;
			}
			for(int i=0;i<n;i++) {
				String str=sc.next();
				String[] ab=str.split(",");
				int a=Integer.parseInt(ab[0])-1;
				int b=Integer.parseInt(ab[1])-1;
				int m=value[a];
				value[a]=value[b];
				value[b]=m;
			}
			for(int i=0;i<w;i++) {
				System.out.println(value[i]);
			}
			
		}
	}

}

