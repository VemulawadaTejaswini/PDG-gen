import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;


class Main {
    // static Scanner sc;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(final String[] args) throws NumberFormatException, IOException {

        // sc = new Scanner(System.in);
        String[] input = br.readLine().split(" ");
        int age = Integer.parseInt(input[0]);
        int cost = Integer.parseInt(input[1]);

        if(age < 13){
            if(age >=6){
                cost = cost/2;
            }else{
                cost = 0;
            }
        }

        System.out.println(cost);
    
    }

    // public static int parseNumber() throws NumberFormatException, IOException {
    //     return Integer.parseInt(sc.nextLine());
    // }
}