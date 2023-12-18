import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] dir = new char[n];
        sc.close();
        dir = s.toCharArray();

        int minCount = 0;
        for(int i = 1; i < n; i++){
            if(dir[i] == 'E'){
                minCount++;
            }
        }

        int count = minCount;
        for(int j = 1; j < n; j++){
            if(dir[j-1] == 'W'){
                count++;
            }
            if(dir[j] == 'E'){
                count--;
            }
            if(count < minCount){
                minCount = count;
            }
        }
        System.out.println(minCount);
    }

}
