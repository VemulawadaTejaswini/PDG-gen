import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] ar = str.split("");
        int n = 0;
        int m = 0;
        int num = 0;
        int length = str.length();

        String a = "A";
        String c = "C";




        if(ar[0].equals(a)){
            n = 0;
            for(int i = 2; i<str.length()-1; i++){
                if(ar[i].equals(c)){
                    n++;
                    num = i;
                }else{
                }
            }


            if(n == 1){
                for(int i = 0; i<str.length(); i++){
                    if(i == 0 || i == num){
                        continue;
                    }
                    if(Character.isLowerCase(str.charAt(i))){
                    }else{
                        m++;
                    }
                }

                if(m == 0){
                    System.out.println("AC");
                }else{
                    System.out.println("WA");
                }

            }else{
                System.out.println("WA");
            }
        }else{
            System.out.println("WA");
        }
    }
}
