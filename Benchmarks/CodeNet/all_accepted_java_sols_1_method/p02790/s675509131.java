import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String a = sc.next();
    	String b = sc.next();
    	sc.close();
    	String A = "";
    	String B = "";
    	for(int i = 0; i < Integer.parseInt(b); i++){
    		A = A.concat(a);
    	}
    	for(int i = 0; i < Integer.parseInt(a); i++){
    		B = B.concat(b);
    	}
    	if(0 <= A.compareTo(B)){
    		System.out.println(B);
    	}else{
    		System.out.println(A);
    	}


    }
}