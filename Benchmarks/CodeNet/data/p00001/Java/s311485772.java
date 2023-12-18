import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	int a[] = new int[10];

	//???????????????
	for(int i = 0;i < 10;i++){
		a[i] = s.nextInt();
	}
	int top = a[0];
	int second =a[0];
	int thard = a[0];
	
	for(int i = 1;i < 10;i++){
		if(top < a[i]){
			top = a[i];
		}else if(second < a[i]){
			second = a[i];
		}else if(thard < a[i]){
			thard = a[i];
		}
	}
	
	System.out.println(top);
	System.out.println(second);
	System.out.println(thard);
  	
  }
}