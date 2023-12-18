import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = Integer.parseInt(sc.nextLine());
			int count = 0;
			for(int i=0;i<10;i++){
				for(int u=0;u<10;u++){
					for(int y=0;y<10;y++){
						for(int t=0;t<10;t++){
							if(i+u+y+t == n){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}