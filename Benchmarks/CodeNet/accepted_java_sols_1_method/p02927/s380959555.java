import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
      	int d = sc.nextInt();
      	      
		int count = 0;      
      	for(int j = 1; j <= m; j++){
          for(int i = 1; i <= d; i++){
            int d1 = i%10;
            int d2 = i/10;
            if(d1 >= 2 && d2 >=2 && (d1*d2 == j))
              count++;
          }
        }
      
      	System.out.println(count);
		
	}
}