import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] S = scanner.nextLine().split("");
        int countA = 0;
        int countB = 0;
        for(int x = 0; x<3; x++){
            if(S[x].equals("A")){
                countA++;
            }else{
                countB++;
            }
        }
    
        if(countA == 2 || countB==2){
            System.out.println("Yes");
        }else{
            System.out.print("No");
        }




    }

}
