import java.util.Scanner;

public class test {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        
        String c = str2.substring(0, str.length());
        

        if(str.equals(c) ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();

    }
}