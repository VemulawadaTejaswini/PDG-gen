import java.util.Scanner;

public class Main{
    public Main(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n == 0){
		break;
	    }
	    String[] str = new String[10];
	    for(int i = 0; i < 10; i++){
		str[i] = "";
	    }
	    for(int i = 0; i < n; i++){
		int t = sc.nextInt();
		str[t] += "*";
	    }

	    for(String s: str){
		if(s.length() == 0){
		    System.out.println("-");
		} else {
		    System.out.println(s);
		}
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}