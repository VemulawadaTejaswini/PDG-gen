import java.util.Scanner;

class Aoj10019 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String x;

        for (x = input.nextInt(); x != 0; x = input.nextInt()){
            int sum = 0;

            for (int i = 0; i < x.length(); i++){
                sum += x.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}