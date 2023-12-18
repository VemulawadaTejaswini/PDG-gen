import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int a;
int []kotae = new int [7];
int saikou =sc.nextInt();
int  saitei=sc.nextInt();

 for(a=0;a<=7;a++){

kotae[a] = saikou-saitei;
System.out.print(saikou);
System.out.print(saitei);
System.out.println(kotae[a]);
	
 }
	
		
	}

}