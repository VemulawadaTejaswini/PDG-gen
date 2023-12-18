import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int m,i,h;

	String s,tempa,tempb,kekka;

	Scanner sc = new Scanner(System.in);

	kekka=null;

	while(true){

		s=sc.next();

		if(s.charAt(0)=='-'){

			break;

		}

		m=sc.nextInt();

		for(i=0;i<m;i++){

			h=sc.nextInt();

			tempa=s.substring(0,h);

			tempb=s.substring(h,s.length());

			kekka=tempb+tempa;
			System.out.printf("%d %s\n",i,kekka);

		}

		System.out.printf("%s\n",kekka);

	}



}

}