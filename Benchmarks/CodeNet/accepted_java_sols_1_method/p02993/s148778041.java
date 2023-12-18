import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String sb = sc.nextLine();

            boolean isGood = true;
            for (int i = 0; i < sb.length()-1; i++) {
                    if (sb.charAt(i) == sb.charAt(i+1)){
                        isGood = false;
                        break;
                    }
                }

            if (isGood)
                System.out.println("Good");
            else
                System.out.println("Bad");
            }


        }
    }