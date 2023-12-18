import java.util.Scanner;
public class Main {
	public static void main(String args[]){
      	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	sc.close();
      	int y = 0;
      	int a = (x-x%100)/100;
      	int b = ((x-100*a)-(x-100*a)%10)/10;
      	int c = x-100*a-10*b;
      	if (a==1){
      		y=y+1;
      	}
      	if (b==1){
      		y=y+1;
      	}
      	if (c==1){
      		y=y+1;
      	}
      	System.out.println(y);
    }
}