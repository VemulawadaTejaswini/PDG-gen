import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int c = scn.nextInt();
      	int check = 0;
      	if(a<=c && c<=b){
          check = 1;
        }
      	if(a>=c && c>=b){
          check = 1;
        }
      	if(check==1){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}