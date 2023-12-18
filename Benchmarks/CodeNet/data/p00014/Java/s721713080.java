import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner	sc	=	new Scanner(System.in);
		int		d	=	sc.nextInt();
		sc.close();
		int		sum	=	0;
		
		for(int i=1; i<(600-d)/d; i++){
			sum	+=	Math.pow(i*d, 2);
		}
		
		/*
		int i	=	1;
		while(i*d<600-d){
			sum += Math.pow(i*d, 2);
			i++;
		}
		*/
		System.out.println(sum);
	}
}