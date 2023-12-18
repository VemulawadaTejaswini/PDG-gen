import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        String[] inputs = input1.split("");
        String[] inputs2 = input2.split("");
        
        int count = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals(inputs2[i])) {
                count++;
            }
        }
        System.out.println(count);
 
    }
}