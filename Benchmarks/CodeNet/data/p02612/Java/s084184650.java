import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int amt = sc.nextInt();
	if(amt%1000!=0){
	    System.out.println(1000-(amt%1000));
	}else{
	    System.out.println(0);
	}
	sc.close();
      }
}
