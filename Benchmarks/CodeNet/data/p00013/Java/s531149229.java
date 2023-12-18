import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1;
		int car[]=new int[100];
		car[0]=s.nextInt();
		while(s.hasNext()){
			car[i]=s.nextInt();
			if(car[i]==0){
				System.out.println(car[i-1]);
				i--;
			}
			else{
				i++;
			}
		}
	}
}