import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
int S = scn.nextInt();
System.out.print(S/3600 + ":" + (S%3600)/60 + ":" + (S%3600)%60);
scn.close();
	}
}
