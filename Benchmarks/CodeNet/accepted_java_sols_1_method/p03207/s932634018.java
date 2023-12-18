import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
          
          Scanner s=new Scanner(System.in);
          int N=s.nextInt();
          int Max=0;
          int save=0;
          int all=0;

         for(int i=0;i<N;i++){
            save=s.nextInt();
            if(Max<save)Max=save;
            all+=save;
         }
            Max=Max/2;
            all-=Max;
            System.out.println(all);
        }
}
