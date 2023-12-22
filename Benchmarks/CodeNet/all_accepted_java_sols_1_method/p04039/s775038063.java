import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		String a[]=new String[K];
		int x=1;
		for(int i=0;i<K;i++){
			a[i]=stdIn.next();
		}
		while(true){
			boolean key=true;
			if(x>=N){
				for(int i=0;i<K;i++){
					String b=String.valueOf(x);
					if(b.indexOf(a[i])!=-1){
						key=false;
						break;
					}
				}
				if(key)
					break;
			}
			x++;
		}
		System.out.println(x);
	}
}