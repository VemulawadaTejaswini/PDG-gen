import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int [] box;
        box = new int[number];
        for(int i = 0; i < number; i++) box[i] = scn.nextInt();

        int count = scn.nextInt();
        int answer = 0;
        for(int j = 0; j < count; j++){
            int check = scn.nextInt();
            if(solve(check,number,box)) answer++;
        }
        System.out.println(answer);
    }
    static boolean solve(int check, int max,int[] box){
        int right = max;
        int left = 0;
        int mid = 0;
        while(left < right){
            mid = (left + right)/2;
            if(box[mid] == check) return true;
            else if(box[mid] < check) left = mid + 1;
            else if(box[mid] > check) right = mid;
        }
        return false;
    }
}
