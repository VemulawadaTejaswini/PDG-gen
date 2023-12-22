import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(br.readLine());
		int w=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int r=sc.nextInt();
		if(x<0||y<0||w<x||h<y){System.out.println("No");}
		else if((x+r<=w&&y+r<=h)&&(x-r>=0&&y-r>=0)){System.out.println("Yes");}
		else{System.out.println("No");}
		}
}