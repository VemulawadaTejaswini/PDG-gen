import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int midExam = sc.nextInt();
        int finalExam = sc.nextInt();
        int reExam = sc.nextInt();

        String grade;
        int sumOfMidAndFinal;

        while(true){
            if(midExam == -1 && finalExam == -1 && reExam == -1){
                break;
            }

            sumOfMidAndFinal = midExam + finalExam;
            
            if(midExam == -1 || finalExam == -1){
                grade = "F";
            }else if(sumOfMidAndFinal >= 80){
                grade = "A";
            }else if(sumOfMidAndFinal >= 65){
                grade = "B";
            }else if(sumOfMidAndFinal >= 50){
                grade = "C";
            }else if(sumOfMidAndFinal >= 30){
                if(reExam >= 50){
                    grade = "C";
                }else{
                    grade = "D";
                }
            }else{
                grade = "F";
            }
            
            System.out.println(grade);

            midExam = sc.nextInt();
            finalExam = sc.nextInt();
            reExam = sc.nextInt();
            
        }


        sc.close();
    }
}
