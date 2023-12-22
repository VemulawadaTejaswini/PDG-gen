import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String score;
        score = new String();

        while(true){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if(m==-1 && f==-1 && r==-1) break;
            
            if(m==-1 || f==-1) score = "F";
            else if(m+f >= 80) score = "A";
            else if(m+f >= 65) score = "B";
            else if(m+f >= 50) score = "C";
            else if(m+f >= 30){
                score = "D";
                if(r >= 50) score = "C";
            } 
            else if(m+f < 30) score = "F";

            System.out.println(score);
        }
        sc.close();
    }
    
}
