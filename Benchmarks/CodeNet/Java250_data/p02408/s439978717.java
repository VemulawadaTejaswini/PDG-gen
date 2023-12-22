import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        boolean[][] card = new boolean[4][13];

        String input = br.readLine();

//      ???????????????????????????????????????????????°
        int n = Integer.parseInt(input);

        for(int i = 0; i < n; i++){
            input = br.readLine();
            String[] strArray = input.split(" ");

            String egara = strArray[0]; //?????????????????????
            int number = Integer.parseInt(strArray[1]); //?????????????????°???

            if(egara.equals("S")){
                card[0][number-1] = true;

            }else if(egara.equals("H")){
                card[1][number-1] = true;

            }else if(egara.equals("C")){
                card[2][number-1] = true;

            }else if(egara.equals("D")){
                card[3][number-1] = true;

            }else{
                break;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                if(card[i][j] == false){
                    if(i == 0){
                        output.append("S");

                    }else if(i == 1){
                        output.append("H");

                    }else if(i == 2){
                        output.append("C");

                    }else if(i == 3){
                        output.append("D");
                    }
                    output.append(" ").append(j+1).append("\n");
                }
            }
        }
        System.out.print(output);
    }
}