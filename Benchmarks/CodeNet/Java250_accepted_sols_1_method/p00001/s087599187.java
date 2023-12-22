import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
	int a[] = new int[10];
	int top = 0;
	int second =0;
	int thard = 0;
	
	//???????????????
	for(int i = 0;i < 10;i++){
		a[i] = s.nextInt();
		if(i > 0){
			if(top <= a[i]){
				thard  = second;
				second = top;//?????????
				top = a[i];
			}else if(second <= a[i] && top >= a[i]){
				thard  = second;
				second = a[i];
			}else if(thard <= a[i] && second >= a[i]){
				thard = a[i];
			}
		}else{
			top = a[i];
		}
	}
	System.out.println(top);
	System.out.println(second);
	System.out.println(thard);
  }
}