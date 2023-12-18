import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO ?????????????????????????????????????????????
          Scanner sc = new Scanner(System.in);
          int w = sc.nextInt();
          int h = sc.nextInt();
          int x = sc.nextInt();
          int y = sc.nextInt();
          int r = sc.nextInt();
          
          if(x<=w-r && x>=r && y<=h-r && y>=r){System.out.println("Yes");}
          else{System.out.println("No");}
          
          
	}

}