import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	String s2 = sc.next();
    	int cnt1 = sc.nextInt();
    	int cnt2 = sc.nextInt();
    	String s3 = sc.next();
    	sc.close();
    	if(s.equals(s3)){
    		cnt1--;
    	}else{
    		cnt2--;
    	}
    	System.out.println(cnt1 + " " + cnt2);
    }
}