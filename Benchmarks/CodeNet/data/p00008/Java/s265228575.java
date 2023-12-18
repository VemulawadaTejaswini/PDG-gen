import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int ans = 0;
			for(int a=0; a<10; a++){
				for(int b=0; b<10; b++){
					for(int c=0; c<10; c++){
						if(n-a-b-c>=0 && n-a-b-c<10) ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}