import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int t = 0;
        for(int i = 0; i < 4; i++){
            if(s.charAt(i) == '+')t++;
            else if(s.charAt(i) == '-')t--;
        }
        System.out.println(t);
    }
}
