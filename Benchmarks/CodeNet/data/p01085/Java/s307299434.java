import java.util.Scanner;
public class Icpc2015A {
	public static void main(String args[]){
		int n,i,max,min,s,m_gap=0,gap=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int data[] = new int[n];
		min = scan.nextInt();
		max = scan.nextInt();
		for(i=0;i<n;i++){
			data[i] = scan.nextInt();
		}
		for(i=min;i<=max;i++){
			s=data[i]-data[i-1];
			if(s<0){
				s=s*-1;
			}
			if(gap<s){
				gap=s;
				m_gap=i;
			}
		}
		System.out.println(m_gap);
	}
}