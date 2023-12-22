import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //endが入力されたらbreak
        while (true) {

            String line = scan.next();	//入力
            int leng = line.length();

            if(line.equals("-")) {
            	break;
            }

            int shuffle = scan.nextInt();

            for(int i=0; i<shuffle; i++) {

            	int num = scan.nextInt();

//            		line = line.charAt(0 + j) + line.charAt(j + leng);
            		line = line.substring(num, leng) + line.substring(0, num);
            }

        	System.out.println(line);
        }
    }
}
