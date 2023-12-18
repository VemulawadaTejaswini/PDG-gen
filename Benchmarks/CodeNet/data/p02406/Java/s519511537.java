import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a,i;
        a = sc.nextInt();
        for(i=1;i<a+1;i++){
            if(i%3==0||Integer.toString(i).contains("3"))System.out.println(" "+i);

        }
   }
}
