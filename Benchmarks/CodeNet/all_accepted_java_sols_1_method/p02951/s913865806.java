import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input A B C
        // A だけ入る容器1に B だけ入っており、
        // C だけ入っている容器2から容器1へ移したとき、
        // 容器2にどれだけ残るか。
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int retNum = 0;
        if(numA < numB + numC){
            retNum = numB + numC - numA;
        }
        System.out.println(retNum);
    }
}
