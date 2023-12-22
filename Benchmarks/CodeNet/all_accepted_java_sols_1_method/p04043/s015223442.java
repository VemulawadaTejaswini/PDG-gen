import java.util.Scanner;

public class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
      	int i = 0, input, total = 0;
      	while(i < 3){
          input = Integer.parseInt(sc.next());
          total += input;
          i++;
        }
      
      	if(total % 10 == 7){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
	}
}
