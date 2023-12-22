import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();
        int c = console.nextInt();
        console.nextLine();

        int listB[];
        listB = new int[m];
        for(int i = 0; i < m; i++){
            listB[i] = console.nextInt();
        }
        console.nextLine();

        int listA[][];
        listA = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                listA[i][j] = console.nextInt();
            }
            console.nextLine();
        }

        int answer = 0;
        for(int i = 0; i < n; i++){
            int num = c;
            for(int j = 0; j < m; j++){
                num += (listA[i][j] * listB[j]);
            }
            if(num > 0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
