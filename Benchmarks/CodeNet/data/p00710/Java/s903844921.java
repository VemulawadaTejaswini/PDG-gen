import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int n,r,i,p,c;

	String hana,tempa,tampb;

	Scanner sc = new Scanner(System.in);
	hana=null;
	tempa=null;
	tempb=null;

	while(true){

		n=sc.nextInt();
		r=sc.nextInt();

		if(n==0&&r==0){

			break;

		}
		for(i=0;i<n;i++){
			hana.charAt(i)='1'+i;
		}

		for(i=0;i<r;i++){

			p=sc.nextInt();
			c=sc.nextInt();
			tempa=hana.substring(0,p-1);
			tempb=hana.substring(p-1+c,s.length());

			hana=hana.substring(p-1,p-1+c);

			hana=hana+tempa+tempb;

		}

		System.out.printf("%c\n",hana.charAt(0));
		hana=null;

	}



}

}