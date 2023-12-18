import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s;
        int sum;
        while(true){
            s = scanner.nextLine();
            if(s.equals("0"))break;
            sum = 0;
            for(int i=0; i< s.length(); i++){
                sum += s.charAt(i) - '0';
            }

            System.out.println(sum);
        }

    }
}

