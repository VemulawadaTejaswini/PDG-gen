import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int a = 0;
      	int b = 0;
      	int num = 0;
      	int min = -1;
		for(int i=1; i<=n/2; i++){
          a = i;
          b = n-i;
          int sum = 0;
          while(a>0){
            sum +=a%10;
            a/=10;
          }
          a = sum;
          sum = 0;
          while(b>0){
            sum +=b%10;
            b/=10;
          }
          b = sum;
          num = a + b;
          if(num<min || min==-1) min = num;
        }
      	System.out.println(min);
	}
}
