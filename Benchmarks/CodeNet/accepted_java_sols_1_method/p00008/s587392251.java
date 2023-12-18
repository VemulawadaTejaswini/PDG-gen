import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n,ans=0;
			n=cin.nextInt();
			for(int a=0;a<10;a++){
				for(int b=0;b<10;b++){
					for(int c=0;c<10;c++){
						for(int d=0;d<10;d++){
							if(a+b+c+d==n){
								ans=ans+1;
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}