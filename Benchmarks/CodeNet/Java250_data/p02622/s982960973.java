import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        int wordNum = text1.length();
        int diffCount=0;

        for(int i=0;i<wordNum;i++){
            if(text1.charAt(i) != text2.charAt(i)){
                diffCount +=1;
            }
        }
        System.out.println(diffCount);
    }
}