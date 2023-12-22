import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int max = 0;
        int count = 0;
        for(int i=0; i<3; i++){
            if(s.charAt(i) == 'S'){
                count = 0;
            }
            else if(s.charAt(i) == 'R'){
                count++;
                if(max < count){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}