import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String[] str = new String[2];
        
        for(int i = 0; i < str.length; i++){
		    str[i] = scan.nextLine();
        }
        
        if(str[1].matches(str[0] + "\\w{1}")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}