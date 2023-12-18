import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        int hands = Integer.parseInt(f.nextLine());
        int leftScore =0, rightScore = 0;
        for(int draw = 0; draw < hands; draw++){
            String[] temp = f.nextLine().split(" ");
            int left = temp[0].length();
            int right = temp[1].length(); // index of the hand
            for(int i =0; i <= Math.max(left, right); i++){
                if(i == right && i == left){
                    leftScore += 1;
                    rightScore += 1;
                    break;
                } else if(i >= left){
                    rightScore += 3;
                    break;
                } else if(i >= right){
                    leftScore += 3;
                    break;
                } else if(temp[0].charAt(i) > temp[1].charAt(i)){
                    leftScore += 3;
                    break;
                } else if(temp[0].charAt(i) < temp[1].charAt(i)){
                    rightScore += 3;
                    break;
                }
            }
        }
        System.out.println(leftScore + " " + rightScore);
    }
}
