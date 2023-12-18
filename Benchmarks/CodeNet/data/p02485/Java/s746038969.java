import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

for(;;){

int x = sc.nextInt();
int sum;


	if(x==0) break;

 sum = 0;
	for(;x!=0;){
		sum+=x%10;
		x=x/10;
	}
	System.out.println(sum);
}
}
}