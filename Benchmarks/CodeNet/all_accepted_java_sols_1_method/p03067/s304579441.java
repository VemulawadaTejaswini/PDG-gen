import java.util.Scanner;
class Main{
	public static void main(String artgs[]){
    	int A;
        int B;
        int C;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        if((A < C &&  C < B )||( A > C &&C > B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }  
}