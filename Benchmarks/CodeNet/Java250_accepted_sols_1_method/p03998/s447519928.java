import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] players =  new String[3];
        for(int i=0; i<3; i++){
            players[i] = scan.nextLine();
        }

        int i=0, j=0, k=0;
        char c = 'a';
        while(true){

            if(c == 'a') {
                if(i == players[0].length()){
                    System.out.println("A");
                    break;
                }
                c = players[c - 'a'].charAt(i++);
            }
            if(c == 'b') {
                if(j == players[1].length()){
                    System.out.println("B");
                    break;
                }
                c = players[c - 'a'].charAt(j++);
            }
            if(c == 'c') {
                if(k == players[2].length()){
                    System.out.println("C");
                    break;
                }
                c = players[c - 'a'].charAt(k++);
            }

        }
    }
}