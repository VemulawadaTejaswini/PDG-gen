import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNext("0")) {
            int sum = 0;
            String line = sc.nextLine();
            char[] ch = line.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                sum += Integer.parseInt("" + ch[i]); 
            }
            System.out.println(sum);
            
        }
        sc.close();
    }

}