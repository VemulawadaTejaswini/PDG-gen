import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,c,i,j=0;
		Scanner br= new Scanner(System.in);
		a=br.nextInt();
		b=br.nextInt();
		c=br.nextInt();
		for(i=a;i<=b;i++){
			if(c%i==0){
				j++;
			}
		}
		System.out.println(j);
	}
}