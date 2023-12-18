import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean[] prime=new boolean[(int)Math.pow(10,8)+1];
		prime[0]=prime[1]=true;
		for(int i=2;i<(int)Math.sqrt(Math.pow(10,8));){
			for(int j=2;i*j<=(int)Math.pow(10,8);j++){
				prime[i*j]=true;
			}
			for(int j=i+1;j<=(int)Math.pow(10,8);j++){
				if(!prime[j]){
					i=j;
					break;
				}
			}
		}
		int N=scan.nextInt();
		int count=0;
		for(int i=0;i<N;i++){
			if(!prime[scan.nextInt()]) count++;
		}
		System.out.println(count);
		scan.close();
	}
}