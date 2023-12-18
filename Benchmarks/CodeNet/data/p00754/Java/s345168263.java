import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/05.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String line;
        int number_round, number_square, _switch;
        char[] sentence;
        outer:
        while(!(line = sc.nextLine()).equals(".")){
            number_round = 0;
            number_square = 0;
            _switch = -1;
            sentence = line.toCharArray();
            for(int i = 0; i < sentence.length; i++){
                if(sentence[i] == '('){
                    _switch = 0;
                    number_round++;
                }
                else if(sentence[i] == ')'){
                    if(_switch == 1){
                        System.out.println("no");
                        continue outer;
                    }
                    _switch = -1;
                    number_round--;
                }
                else if(sentence[i] == '['){
                    _switch = 1;
                    number_square++;
                }
                else if(sentence[i] == ']'){
                    if(_switch == 0){
                        System.out.println("no");
                        continue outer;
                    }
                    _switch = -1;
                    number_square--;
                }
                if(number_round < 0 || number_square < 0){
                    System.out.println("no");
                    continue outer;
                }
            }
            if(number_round == 0 || number_square == 0) System.out.println("yes");
            else System.out.println("no");
        }
    }
}