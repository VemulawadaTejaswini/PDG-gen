import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m[]=new int[100];
		int a[]=new int[100];
		int b[]=new int[100];
		int weight=0;
		int s, e;
		boolean brea = false;
		while(true){
			n = sc.nextInt();
			if(n==0)
				break;
			for(int i=0; i<n; i++){
				m[i] = sc.nextInt();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			for(int i=0; i<n; i++){
				s = a[i];
				e = b[i];
				for(int j=s; j<e; j++){
					for(int k=0; k<n; k++)
						if(a[k]<=j && j<b[k])
							weight = weight+m[k];
					if(weight>150){
						//System.out.println(j);
						System.out.println("NG");
						brea= true;
						if(brea)
							break;
					}
					weight = 0;
				}
				
					if(brea)
						break;
				
			}
			if(!brea)
				System.out.println("OK");
			brea=false;
		
		weight = 0;
		}
	}

}