import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int idx = 0;
			int max_value = 0;
			for(int i=0;i<5;i++){
				int tmp = stdIn.nextInt() + stdIn.nextInt();
				if(i==0&&tmp==0){
					return;
				}
				if(max_value<tmp){
					max_value = tmp;
					idx = i;
				}
			}
			System.out.print(idx==0?"A":idx==1?"B":idx==2?"C":idx==3?"D":"E");
			System.out.println(" "+max_value);
		}
	}
}