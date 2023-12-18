import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int count=1;
	while(true){
	    int tmp = sc.nextInt();
	    if(tmp!=0){
		System.out.println("Case " + count + ": " + tmp);
		count++;
	    }else{
		break;
	    }
	}
    }
}