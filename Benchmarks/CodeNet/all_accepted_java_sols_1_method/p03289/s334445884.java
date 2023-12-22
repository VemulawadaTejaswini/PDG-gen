import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        String a = "kyoto";
//        String b = "tokyo";
        //Scanner cin = new Scanner(new FileReader("src\\AtcoderContest0805\\task2-test-input.txt"));
        Scanner cin = new Scanner(System.in);
        String a = cin.nextLine();
        if (a.charAt(0)!='A') {
            System.out.println("WA");
            return;
        }

        int count = 0;
        for (int i=0;i<a.length();i++){
                if (a.charAt(i)=='C') count++;
        }
        if (count>1) {
            System.out.println("WA");
            return;
        }
        else if (count==0) {
            System.out.println("WA");
            return;
        }
        else {
            if (a.indexOf("C")==1||a.indexOf("C")==a.length()-1) {
                System.out.println("WA");
                return;
            }
        }

        for (int i=1;i<a.length();i++) {
            if (a.charAt(i)=='C') continue;
            char temp = a.charAt(i);
            if (!(temp>='a'&&temp<='z')) {
                System.out.println("WA");
                return;
            }
        }

        System.out.println("AC");
        return;
    }

}