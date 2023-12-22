import java.util.Scanner;

class Main{

 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();

	int sec = a%60;
	int hou = a/3600;
	int min = (a-hou*3600)/60;

  System.out.println( hou+":"+min+":"+sec);

  }
}

