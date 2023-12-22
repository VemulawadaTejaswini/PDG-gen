import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int start = sc.nextInt();
    	int end = sc.nextInt();
    	sc.close();
    	int ans = 0;
    	for(int i = start; i <= end; i++){
    		String str = String.valueOf(i);
    		String str2 = str.substring(4, 5) + str.substring(3, 4);
    		if(str.substring(0, 2).equals(str2)) ans++;
		}
    	System.out.println(ans);
    }

}
