import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] check = new int[3];
		int A = scan.nextInt();
      	int B = scan.nextInt();
      	int C = scan.nextInt();
      
      	check[0] = A;
        check[1] = B;
        check[2] = C;
      	
      	int count_5 = 0;
      	int count_7 = 0;
      	
        for(int i=0; i<check.length; i++){
          if(check[i] == 5){
            count_5++;
          }else if(check[i] == 7){
            count_7++;
          }
        }
      
      	if(count_5 == 2 && count_7 == 1){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
	}
}