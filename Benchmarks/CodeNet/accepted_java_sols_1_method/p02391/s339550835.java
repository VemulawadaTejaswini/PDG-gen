import java.util.Scanner;

class Main{
    public static void main(String[] args){
        String str = new Scanner(System.in).nextLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        if(a<b){
            System.out.println("a < b");
        }else if(a>b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
