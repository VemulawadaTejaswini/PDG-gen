import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true){
            String str = scn.next();
            if(str.equals("-")) break;

            int count = scn.nextInt();
            for(int i = 0; i < count; i++){
                int num = scn.nextInt();
                String tmp1 = str.substring(0,num);
                String tmp2 = str.substring(num);
                str = tmp2 + tmp1;
            }
            System.out.println(str);
        }
    }
}
