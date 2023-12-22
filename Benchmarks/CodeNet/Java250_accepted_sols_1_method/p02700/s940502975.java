import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
 		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

 		int counta = 0;
        while(C-B>0){
            C -= B;
                counta++;
        }
        int countt = 0;
        while(A-D>0){
            A -= D;
                countt++;
        }
        if(counta<=countt){
        System.out.println("Yes");
        }else{
        System.out.println("No");            
        }
	}
}