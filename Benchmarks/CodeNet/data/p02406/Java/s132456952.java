	import java.util.Scanner;
	public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	//while(true) {
	int a = sc.nextInt();
	int i;
	//if (a == 0) {
	//break;
	
	for(i=3;i<=a;i++){int j=i;
		if(j%3==0){System.out.printf(" "+i);
		
		}else{
		while(j!=0){if(j%10==3){System.out.printf(" "+i);break;}
		
		j/=10;}
		}}
	System.out.println();
	
	}}
	
	