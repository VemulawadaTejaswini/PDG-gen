import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();
        
        int length = s.length();

        if(k >= length){
            System.out.println(s);
        }else{
            String tmp = s.substring(0, k);
            System.out.println(tmp + "...");
        }

        scan.close();
    }
}