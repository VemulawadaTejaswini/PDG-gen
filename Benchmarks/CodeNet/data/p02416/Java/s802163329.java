import java.util.Scanner;

 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String in = scanner.nextLine();
            int sum = 0;

            if (in.equals("0")) break;
    
            for (int i=0; i<in.length(); i++) {
                char c = in.charAt(i);
                int n = Character.getNumericValue(c);
                sum += n;
            }
    
            System.out.println(sum);
        }
    }
}

