import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputA = Integer.parseInt(input.split(" ")[0]);
        int inputB = Integer.parseInt(input.split(" ")[1]);
        int inputC = Integer.parseInt(input.split(" ")[2]);
        if(inputA >= inputB && inputA >= inputC){
            System.out.println(inputA * 10 + inputB + inputC);
        }else if(inputB >= inputA && inputB >= inputC){
            System.out.println(inputB * 10 + inputA + inputC);
        }else{
            System.out.println(inputC * 10 + inputA + inputB);
        }
    }
}