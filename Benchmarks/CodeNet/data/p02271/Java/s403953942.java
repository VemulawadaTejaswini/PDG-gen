import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int [] box;
        box = new int[number];
        for(int i = 0; i < number; i++) box[i] = scn.nextInt();

        int count = scn.nextInt();
        for(int j = 0; j < count; j++){
            int check = scn.nextInt();
            if(solve(0,check,box,number)) System.out.println("yes");
            else System.out.println("no");
        }
    }
    static boolean solve(int i, int check,int[] box,int num){
        if(check == 0) return true;
        if(i >= num) return false;
        boolean result = solve((i + 1), check,box,num) || solve((i + 1),(check - box[i]),box,num);
        return result;
    }
}

