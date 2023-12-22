import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String key = sc.nextLine();
        String test = str+str;

        if(test.contains(key)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        sc.close();
    }
}
