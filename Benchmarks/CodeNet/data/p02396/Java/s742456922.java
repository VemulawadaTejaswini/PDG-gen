import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int i=1;
	while(true){
	  int num = in.nextInt();
	  if(num==0)break;
	  System.out.println("Case"+ i +": "+num);
	  i++;
	}
    }
}
	  

