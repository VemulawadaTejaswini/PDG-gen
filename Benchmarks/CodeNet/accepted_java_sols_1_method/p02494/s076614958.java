import java.util.Scanner;

class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int i,j;
	  for(;;){
		  i = sc.nextInt();
		  j = sc.nextInt();
		  if(i==0&&j==0){break;}
		  for(;i>0;i--){
			  for(int jj=0;jj<j;jj++){
				  System.out.print("#");
			  }
			  System.out.println("");
		  }
		  System.out.println("");
	  }
  }
}