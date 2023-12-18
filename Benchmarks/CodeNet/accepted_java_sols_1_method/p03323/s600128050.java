import java.util.Scanner;



class Main {

	public static void main(String[] args) {
      	// loading data
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();
      
      	// processing
      	int a_num  = Integer.parseInt(A);
      	int b_num  = Integer.parseInt(B);
      	int ab_sum = a_num + b_num;

      	if(a_num<=8 && ab_sum <= 16 && b_num<=8){ 
          System.out.println("Yay!");
        }else{
          System.out.println(":(");
        }

 	}
  

}