import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String[] s = new String[stdIn.nextInt() + 1];
        for(int i = 0 ; i < s.length ; i++){
            s[i] = stdIn.nextLine();
        }
        int[] c = {0 , 0 , 0 , 0};
        for(int i = 0 ; i < s.length ; i++){
            if(s[i].equals("AC")){
                c[0] += 1;
            }else if(s[i].equals("WA")){
                c[1] += 1;
            }else if(s[i].equals("TLE")){
                c[2] += 1;
            }else if(s[i].equals("RE")) {
                c[3] += 1;
            }
        }
        System.out.println("AC x " + c[0]);
        System.out.println("WA x " + c[1]);
        System.out.println("TLE x " + c[2]);
        System.out.println("RE x " + c[3]);
    }
}
