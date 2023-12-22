import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        while(n != 0){
            double a = 0;
            String input = scanner.nextLine();

            String inputArr[] = input.split(" ");
            double tmp = 0;
            for (int i=0; i<n; i++) {
                tmp += Double.parseDouble(inputArr[i]);
            }
            double average = tmp / n;

            for(int i=0; i<n; i++){
                a += Math.pow(Double.parseDouble(inputArr[i]) - average,2);
            }
            System.out.println( String.format("%.8f",Math.sqrt(a/n)) );
            
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}
