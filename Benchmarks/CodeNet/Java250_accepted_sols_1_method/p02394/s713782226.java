import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine();
        String[] str = new String[5];
        str = strInput.split(" ");
        int w = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);
        int r = Integer.parseInt(str[4]);
        if(x+r > w){
            System.out.println("No");
        }else if(x-r<0){
            System.out.println("No");
        }else if(y+r>h){
            System.out.println("No");
        }else if(y-r<0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
