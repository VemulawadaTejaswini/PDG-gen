import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char rank;
		for(;;){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			if(m==-1 || f==-1){
				rank ='F';
			}
			else if(m+f >= 80){
				rank ='A';
			}
			else if(m+f >= 65){
				rank ='B';
			}
			else if(m+f >= 50){
				rank ='C';
			}
			else if(r >= 50){
				rank ='C';
			}
			else if(r >= 30){
				rank ='D';
			}
			else{
				rank ='F';
			}
			System.out.println(rank);
		}
	}

}