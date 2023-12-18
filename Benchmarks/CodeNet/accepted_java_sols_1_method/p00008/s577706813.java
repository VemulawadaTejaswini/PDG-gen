import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			try{
				int N = in.nextInt();
				int count = 0;
				for(int a = 0;a < 10;a++){
					for(int b = 0;b < 10;b++){
						for(int c = 0;c < 10;c++){
							for(int d = 0;d < 10;d++){
								if(N == a + b + c + d){
									count++;
								}
							}
						}
					}
				}
				System.out.println(count);		
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}