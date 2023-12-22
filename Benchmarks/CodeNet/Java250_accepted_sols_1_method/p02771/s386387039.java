import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n1 = Integer.parseInt(sc.next());
	int n2 = Integer.parseInt(sc.next());
	int n3 = Integer.parseInt(sc.next());

        String result;

	if(n1 == n2){
	    if(n1 == n3){
		result = "No";
	    } else {
		result = "Yes";
	    }
	} else if(n1 == n3){
	    result = "Yes";
        } else if(n2 == n3) {
	    result = "Yes";
	} else {
	    result = "No";
	}
    
	System.out.println(result);

    }
}