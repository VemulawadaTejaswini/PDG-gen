import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

      	int sc = s.nextInt();

        int judge = 0;
        for (int i = 1; i < sc+1; i++) {
            if((String.valueOf( i ).length())%2 ==1){
                judge++;
            }
        }
        System.out.println(judge);

    }
}