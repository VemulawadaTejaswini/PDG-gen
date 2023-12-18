import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	int a = sc.nextInt();
	if(a-2*b<0||a%2!=0||2*b-a/2<0){
	    System.out.println("No");
	}else{
	    System.out.println("Yes");
	}
	sc.close();
      }
}
