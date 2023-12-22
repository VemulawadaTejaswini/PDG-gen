import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	double money =0;


       	for(int i =1 ;i<=N;i++){

       		double A = sc.nextDouble();
           	String B =sc.next();

           	if(B.equals("JPY")){
           		money +=A;
           	}else if (B.equals("BTC") ){
           		money += A*380000.0;
           	}
       	}

       	System.out.println( money);


}
}
