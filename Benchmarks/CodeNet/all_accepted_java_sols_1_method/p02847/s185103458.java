
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        //int n = Integer.parseInt(scanner.nextLine());
        String d = scanner.nextLine();
        
        if(d.equals("SUN")) System.out.println(7);
        if(d.equals("MON")) System.out.println(6);
        if(d.equals("TUE")) System.out.println(5);
        if(d.equals("WED")) System.out.println(4);
        if(d.equals("THU")) System.out.println(3);
        if(d.equals("FRI")) System.out.println(2);
        if(d.equals("SAT")) System.out.println(1);
                
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}