import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		for(int i=0;i<n;i++){
			p[i]=sc.nextInt();
		}
		int count = 0;
		for(int i=1;i<n-1;i++){
			int tmp[] = new int[3];
			tmp[0] = p[i-1];
			tmp[1] = p[i];
			tmp[2] = p[i+1];
			for(int j=0;j<tmp.length-1;j++){
				for(int k=1;k<tmp.length;k++){
					if(tmp[k-1]>tmp[k]){
						int t = tmp[k-1];
						tmp[k-1] = tmp[k];
						tmp[k] = t;
					}
				}

			}

			if(tmp[1]==p[i]){
				count++;
			}

		}
		System.out.println(count);

	}
}
