import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		char s[]=new char[n];
		int r[]=new int[n];
		for(int i=0;i<n;i++){
			String str=sc.next();
			s[i]=str.charAt(0);
			r[i]=sc.nextInt();
		}

		int sp[]=new int[13];
		int he[]=new int[13];
		int cl[]=new int[13];
		int di[]=new int[13];
		int x;
		for(int i=0;i<n;i++){
			switch(s[i]){
			case 'S':
				x=r[i];
				sp[x-1]++;
				break;
			case 'H':
				x=r[i];
				he[x-1]++;
				break;
			case 'C':
				x=r[i];
				cl[x-1]++;
				break;
			case 'D':
				x=r[i];
				di[x-1]++;
				break;
			}
		}
			for(int i=0;i<13;i++){
				if(sp[i]==0)		System.out.println("S "+(i+1));
			}
			for(int i=0;i<13;i++){
				if(he[i]==0)		System.out.println("H "+(i+1));
			}
			for(int i=0;i<13;i++){
				if(cl[i]==0)		System.out.println("C "+(i+1));
			}
			for(int i=0;i<13;i++){
				if(di[i]==0)		System.out.println("D "+(i+1));
			}
		}
	}