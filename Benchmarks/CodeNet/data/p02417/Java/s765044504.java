import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        StringBuilder s = new StringBuilder();

        while(inp.hasNext()){
            s.append(inp.nextLine());
        }

        count(s.toString());
    }

    public static void count(String s) {
        for (int alpha = 0; alpha < 26; alpha++) {
            String letter;
            int counter = 0;

            switch (alpha) {
                case 0: letter = "a";
                        break;
                case 1: letter = "b";
                        break;
                case 2: letter = "c";
                        break;
                case 3: letter = "d";
                    break;
                case 4: letter = "e";
                    break;
                case 5: letter = "f";
                    break;
                case 6: letter = "g";
                    break;
                case 7: letter = "h";
                    break;
                case 8: letter = "i";
                    break;
                case 9: letter = "j";
                    break;
                case 10: letter = "k";
                    break;
                case 11: letter = "l";
                    break;
                case 12: letter = "m";
                    break;
                case 13: letter = "n";
                    break;
                case 14: letter = "o";
                    break;
                case 15: letter = "p";
                    break;
                case 16: letter = "q";
                    break;
                case 17: letter = "r";
                    break;
                case 18: letter = "s";
                    break;
                case 19: letter = "t";
                    break;
                case 20: letter = "u";
                    break;
                case 21: letter = "v";
                    break;
                case 22: letter = "w";
                    break;
                case 23: letter = "x";
                    break;
                case 24: letter = "y";
                    break;
                default: letter = "z";
                    break;
            }
            String letterUp = letter.toUpperCase();

            for (int i = 0; i < s.length(); i++) {
                if ((""+s.charAt(i)).equals(letter) || (""+s.charAt(i)).equals(letterUp)) {
                    counter++;
                }
            }

            System.out.println(letter + " : " + counter);
        }
    }
}

