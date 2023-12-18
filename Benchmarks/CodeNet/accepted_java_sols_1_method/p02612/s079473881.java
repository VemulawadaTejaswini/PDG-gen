        import java.util.Scanner;
         
        public class Main {
         
        	public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String price = scan.nextLine();
                scan.close();
         
                int otsuri = Integer.parseInt(price) % 1000;
                if (otsuri == 0) {
                    System.out.println(otsuri);
                } else {
                    System.out.println(1000 - otsuri);
                }
            }
        }