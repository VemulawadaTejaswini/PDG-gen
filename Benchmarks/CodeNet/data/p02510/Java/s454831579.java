import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int m,i,h;

	String s,temp;

	Scanner sc = new Scanner(System.in);

	while(true){

		s=sc.next();

		if(s.charAt(0)=='-'){

			break;

		}

		m=sc.nextInt();

		for(i=0;i<m;i++){

			h=sc.nextInt();

			temp=s.substring(0,h);

			s=s.substring(h,s.length());

			s=s+temp;

		}

		System.out.printf("%s\n",s);

	}



}

}