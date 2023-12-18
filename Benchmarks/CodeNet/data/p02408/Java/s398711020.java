import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

//      ???????????????????????????????????????????????°
        int n = Integer.parseInt(input);

        while(true){

            input = br.readLine();
            String[] strArray = input.split(" ");

            String egara = strArray[0]; //?????????????????????
            int number = Integer.parseInt(strArray[1]); //?????????????????°???

            if(egara.equals("S")){
                System.out.println("S" + numCheck(number));
            }

            if(egara.equals("H")){
                System.out.println("H" + numCheck(number));
            }

            if(egara.equals("C")){
                System.out.println("C" + numCheck(number));
            }

            if(egara.equals("D")){
                System.out.println("D" + numCheck(number));
            }
        }
    }

    public static int numCheck(int number){

        int lostCard = 0;

        for(int i = 1; i <= 13; i++){
            if(number != i){
                lostCard = number;
            }
        }
        return lostCard;
    }

}