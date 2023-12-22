import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String labelStr = scanner.nextLine();
        String[] labelArr = labelStr.split(" ");
        int dice[] = new int[6];
        for (int i=0; i<6; i++) {
            dice[i] = Integer.parseInt(labelArr[i]);
        } 
        
        String orderStr = "";
        String questNum = scanner.nextLine();
        for(int i= 0;i<Integer.parseInt(questNum);i++ ){
            String input = scanner.nextLine();
            String inputArr[] = input.split(" ");

            int t = Integer.parseInt(inputArr[0]);
            int f = Integer.parseInt(inputArr[1]);
            
            if( (t==dice[1] && f==dice[2]) || (t==dice[2] && f==dice[4]) || (t==dice[3] && f==dice[1]) || (t==dice[4] && f==dice[3]) ){
                System.out.println(dice[0]);
            } else if( (t==dice[0] && f==dice[3]) || (t==dice[2] && f==dice[0]) || (t==dice[3] && f==dice[5]) || (t==dice[5] && f==dice[2]) ) {
                System.out.println(dice[1]);      
            } else if( (t==dice[0] && f==dice[1]) || (t==dice[1] && f==dice[5]) || (t==dice[4] && f==dice[0]) || (t==dice[5] && f==dice[4]) ) {
                System.out.println(dice[2]);      
            } else if( (t==dice[0] && f==dice[4]) || (t==dice[1] && f==dice[0]) || (t==dice[4] && f==dice[5]) || (t==dice[5] && f==dice[1]) ) {
                System.out.println(dice[3]);      
            } else if( (t==dice[0] && f==dice[2]) || (t==dice[2] && f==dice[5]) || (t==dice[3] && f==dice[0]) || (t==dice[5] && f==dice[3]) ) {
                System.out.println(dice[4]);      
            } else {
                System.out.println(dice[5]);      
            }
        }
    }
}

