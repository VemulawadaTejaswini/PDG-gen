import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String[] str = input1.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int count = 0;
        for(int i=a; i<=b; i++){
            if(c%i == 0){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
