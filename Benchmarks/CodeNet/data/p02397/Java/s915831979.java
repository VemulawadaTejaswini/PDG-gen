import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i,j;
		
		i=in.nextInt();
		j=in.nextInt();
		while(i!=0 || j!=0){
			if(i<j){
				System.out.println(i+" "+j);
			}else if(i>j){
				System.out.println(j+" "+i);	
			}else{
				System.out.println(i+" "+j);
			}
			i=in.nextInt();
			j=in.nextInt();
		}
		
		in.close();
	}
}