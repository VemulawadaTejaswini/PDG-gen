import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inputs[] = new String[input.length()];

        ArrayList<Character> kotae = new ArrayList<Character>();

        for(int i = 0; i < input.length(); i++){
            inputs[i] = String.valueOf(input.charAt(i));
        }

        for (int i = 0; i < input.length() ; i++){

            if(inputs[i].equals("0")){
                kotae.add('0');
            }

            if(inputs[i].equals("1")){
                kotae.add(('1'));
            }

            if(inputs[i].equals("B") && kotae.size() > 0){
                kotae.remove(kotae.size() -1);
            }

        }

        for(Character an : kotae){
            System.out.print(an);
        }

    }
}
