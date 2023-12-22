import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int turn = Integer.parseInt(br.readLine());
        int tarou = 0; int hanako = 0;
        for(int i = 0; i < turn; i++){
            String[] card = br.readLine().split(" ");
            if(card[0].compareToIgnoreCase(card[1]) == 0){
                tarou++; hanako++;
            }else if(card[0].compareToIgnoreCase(card[1]) > 0){
                tarou += 3;
            }else{
                hanako += 3;
            }
        }
        System.out.println(tarou+" "+hanako);
    }
}