import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int faceNum = sc.nextInt();
        int limitScore = sc.nextInt();
        
        int face, score, cnt;
        double pr = 0;
        for(face = 1; face <= faceNum; face++){
            score = face;
            cnt = 0;
            while(score < limitScore){
                score *= 2;
                cnt++;
            }
            pr += 1 / Math.pow(2, cnt);
        }

        System.out.println(pr / faceNum);
    }
}