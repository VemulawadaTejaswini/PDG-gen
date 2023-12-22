import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i,x;
		i=1;
		Scanner sc= new Scanner(System.in);
		while(i>0){ 
			x = sc.nextInt();
			if(x!=0){
				System.out.println("Case "+i+": "+x);
				i++;
			}else{
				break;
			}
		}
	}
}