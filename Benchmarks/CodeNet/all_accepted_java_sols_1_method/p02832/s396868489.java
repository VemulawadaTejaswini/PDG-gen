import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];
        int answer = 0;

        for(int i=0;i<a;i++){
            if(sc.nextInt() == answer + 1)
                answer++;
        }
        if(answer == 0)
            System.out.println(-1);
        else
            System.out.println(a-answer);
    }
}