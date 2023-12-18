import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();
            String[] strArray = input.split(" ");

            int middleScore = 0;    //??????????¨?????????°
            int finalScore = 0;     //??????????¨?????????°
            int revengeScore = 0;   //???????¨?????????°

//          ??????????????????????????¨???-1?????¨??????????????????
            if(middleScore == -1 && finalScore == -1 && revengeScore == -1){
                break;
            }

            middleScore = Integer.parseInt(strArray[0]);
            finalScore = Integer.parseInt(strArray[1]);
            revengeScore = Integer.parseInt(strArray[2]);

            System.out.println(grading(middleScore, finalScore, revengeScore));

        }
    }

    public static String grading(int middleScore, int finalScore, int revengeScore){

        int sum = middleScore + finalScore;
        String grade = "";

        if(middleScore == -1 || finalScore == -1){
            grade = "F";
        }

        if(80 <= sum){
            grade = "A";
        }else if(65 <= sum && sum < 80){
            grade = "B";
        }else if(50 <= sum && sum < 65){
            grade = "C";
        }else if(30 <= sum && sum < 50){
            if(50 <= revengeScore){
                grade = "C";
            }else{
                grade = "D";
            }
        }else{
            grade = "F";
        }

        return grade;

    }
}