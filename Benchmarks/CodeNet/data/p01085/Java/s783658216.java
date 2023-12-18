import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		int n,f=0,i,max,min,s,gap=0,m_gap=0;
		int flie[] = new int[10000];
		Scanner scan = new Scanner(System.in);
		while(true){
			gap = 0;
			n = scan.nextInt();
			int data[] = new int[n];
			for(i=0;i<n;i++){
				data[i]=0;
			}
			min = scan.nextInt();
			max = scan.nextInt();
			if(n==max && max==min){
				break;
			}
			for(i=0;i<n;i++){
				data[i] = scan.nextInt();
			}
			for(i=min;i<=max;i++){
				s=data[i]-data[i-1];
				if(s<0){
					s=s*-1;
				}if(gap<s){
					gap=s;
					flie[f]=i;
				}
			}
		f++;
		}
		for(i=0;i<f;i++){
			m_gap=flie[i];
			System.out.println(m_gap);
		}
	}
}