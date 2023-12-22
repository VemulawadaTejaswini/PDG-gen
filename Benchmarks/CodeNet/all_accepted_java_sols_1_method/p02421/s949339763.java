import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t_score = 0, h_score = 0;
        String t, h;
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            t = scanner.next();
            h = scanner.next();
            if(t.compareTo(h) > 0)t_score+=3;
            else if(t.compareTo(h) < 0)h_score+=3;
            else {
                t_score++;
                h_score++;
            }
        }
        System.out.println(t_score + " " + h_score);


    }
}

