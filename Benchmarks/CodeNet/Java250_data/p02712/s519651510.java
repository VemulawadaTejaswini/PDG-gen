import java.util.Scanner;
public class Main {
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a =0;
        for(int i=0; i<=N; i++){
           if(i%3==0 && i%5==0){
           }else if(i%3==0 && i%5!=0){
           }else if(i%3!=0 && i%5==0){
           }else if(i%3!=0 || i%5!=0){
           a +=i;		 
           }
        }
          System.out.println(a);
	}
}