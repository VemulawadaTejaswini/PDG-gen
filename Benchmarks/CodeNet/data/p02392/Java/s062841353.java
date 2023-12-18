import java.util.Scanner;

class Main{
    public static void main(String[] args){
        String str = new Scanner(System.in).nextLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);
        if(a<b&&b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
