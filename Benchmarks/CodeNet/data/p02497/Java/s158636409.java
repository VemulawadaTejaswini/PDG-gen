import java.util.Scanner;
public class Main{
    public static void main(String[]args){
	while(true){
	Scanner sc= new Scanner(System.in);
       	int m= sc.nextInt();
	int f=sc.nextInt() ;
	int r=sc.nextInt();
	int s=m+f;
	if(m==-1 && f==-1 && r==-1){break;}
        else if(m==-1||f==-1){System.out.printf("F\n");}
	else if(s>=80){System.out.printf("A\n");}
	else if(s>=65){System.out.printf("B\n");}
	else if(s>=50){System.out.printf("C\n");}
	else if(s>=30 &&r>=50){System.out.printf("C\n");}
	else if(s>=30){System.out.printf("D\n");}
       	else {System.out.printf("F\n");}
}
    }
}